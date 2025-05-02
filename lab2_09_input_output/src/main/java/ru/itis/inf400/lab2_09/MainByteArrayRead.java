package ru.itis.inf400.lab2_09;

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainByteArrayRead {
    public static void main(String[] args) {

        byte[] bytes = {1, 2, 3, 4, 5, 6, 7};

        InputStream is = new ByteArrayInputStream(bytes);

            try {
                int r;
                while ((r = is.read()) > -1) {
                    System.out.println(r);
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    is.close();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
