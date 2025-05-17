package ru.itis.inf400.lab2_12.db;

import ru.itis.inf400.lab2_12.model.Book;

import java.io.ByteArrayOutputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
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
                DataOutputStream dos = new DataOutputStream(data)) {
            dos.writeInt(book.getId()); // id
            dos.writeByte(1); // flag
            dos.writeInt(objectData.length); // size
            dos.write(objectData); // object

            // пишем в конец файла
            Files.write(
                    file.toPath(),
                    data.toByteArray(),
                    StandardOpenOption.APPEND);

            Index idx = new Index();
            idx.setId(book.getId());
            idx.setPosition(position);

            IndexUtils.index.add(idx);
        }
    }
}
