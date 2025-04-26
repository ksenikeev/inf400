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
