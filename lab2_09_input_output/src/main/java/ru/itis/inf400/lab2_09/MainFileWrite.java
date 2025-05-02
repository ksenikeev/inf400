package ru.itis.inf400.lab2_09;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class MainFileWrite {
    public static void main(String[] args) {
        try (OutputStream fos = new FileOutputStream("test.txt")) {
            String[] strs = {"Тест", "OutputStream", "для FileOutputStream"};

            for (String s : strs) {
                fos.write(s.getBytes("utf-8"));
            }
            fos.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
