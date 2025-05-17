package ru.itis.inf400.lab2_12.db;

import ru.itis.inf400.lab2_12.model.Book;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.StandardOpenOption;

public class DBUtils {

    public static void appendBook(Book book) throws IOException {
        // сериализовать book и записать в массив
        byte[] objectData = null;

        File file = new File(IndexUtils.DB_PATH + "book.tbl");

        int position = 0;

        if (file.exists()) {
            position = (int) file.length();
        }

        try(ByteArrayOutputStream data = new ByteArrayOutputStream();
                DataOutputStream dos = new DataOutputStream(data);
                // открываем файловый поток в режиме добавления в конец
                FileOutputStream fos = new FileOutputStream(file, true)) {

            dos.writeInt(book.getId()); // id
            dos.writeByte(1); // flag
            dos.writeInt(objectData.length); // size
            dos.write(objectData); // object

            // пишем в конец файла
            fos.write(data.toByteArray());

            Index idx = new Index();
            idx.setId(book.getId());
            idx.setPosition(position);

            IndexUtils.index.add(idx);
        }
    }

    public static void readBook(int id) {
        File file = new File(IndexUtils.DB_PATH + "book.tbl");
        try (RandomAccessFile raf = new RandomAccessFile(file, "rw")) {
            raf.seek(5); // Go to byte at offset position 5.
            raf.read(); // Write byte 70 (overwrites original byte at this offset).
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
