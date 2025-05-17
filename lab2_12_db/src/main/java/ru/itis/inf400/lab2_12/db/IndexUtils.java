package ru.itis.inf400.lab2_12.db;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class IndexUtils {

    public static List<Index> index = new ArrayList<>();

    public static final String DB_PATH = "db/";

    public static void loadIndex() {
        try (DataInputStream dis =
                     new DataInputStream(new FileInputStream(DB_PATH + "book.idx"))) {
            while (true) {
                Index idx = new Index();
                idx.setId(dis.readInt());
                idx.setPosition(dis.readLong());
                index.add(idx);
            }
        } catch (EOFException e) {

        } catch (IOException e) {
            // перечитываем файл с БД и индексируем его (создаем индекс заново)
        }

        index.sort((a,b) -> a.getId() - b.getId());
    }

    /**
     * записать в файл db/book.idx содержимое List<Index> index
     */
    public static void saveIndex() {
        //DataOutputStream
    }


}
