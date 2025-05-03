package ru.itis.inf400.lab2_09.readerwriter;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainFileWriter {
    public static void main(String[] args) {

        File fileSrc = new File("bookings.json");
        File fileDst = new File("bookings1.json");

        try (BufferedReader reader = new BufferedReader(new FileReader(fileSrc));
             BufferedWriter writer = new BufferedWriter(new FileWriter(fileDst))
        ) {
            Pattern pattern = Pattern.compile("(\\d{4})-(\\d{2})-(\\d{2})");
            while (reader.ready()) {
                String str = reader.readLine();
                Matcher matcher = pattern.matcher(str);
                if(matcher.find()){
                    str = str.replace(
                            matcher.group(0),
                            matcher.group(3) +
                                    "." + matcher.group(2) +
                                    "." + matcher.group(1)
                    );
                }
                //

                writer.write(str + "\n");
            }
            writer.flush();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
