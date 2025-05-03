package ru.itis.inf400.lab2_09.readerwriter;

import java.io.*;

public class MainFileReader {
    public static void main(String[] args) {
        File file = new File("bookings.json");

        try (Reader reader = new FileReader(file);
            BufferedReader br = new BufferedReader(reader)
            ) {

            while (br.ready()) {
                System.out.println(br.readLine());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
