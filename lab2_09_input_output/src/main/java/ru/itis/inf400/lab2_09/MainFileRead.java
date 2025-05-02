package ru.itis.inf400.lab2_09;

import java.io.ByteArrayInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

public class MainFileRead {
    public static void main(String[] args) {

        InputStream is = null;
        try {
            is = new FileInputStream("bookings.json");
            int r;
            long start = System.nanoTime();
            while ((r = is.read()) > -1) {
                System.out.print((char)r);
            }
            long end = System.nanoTime();
            System.out.println("Прочитали за "  + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                is.close();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }

        try (InputStream fis = new FileInputStream("bookings.json")) {
            byte[] buffer = new byte[1024];
            int r;
            long start = System.nanoTime();
            while ((r = fis.read(buffer)) > 0) {
                System.out.print(new String(buffer, 0, r));
            }
            long end = System.nanoTime();

            System.out.println("Прочитали за "  + (end - start));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
