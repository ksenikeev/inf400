package ru.itis.inf400.lab15;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MainBigText {
    public static void main(String[] args) throws FileNotFoundException {

        Pattern pattern = Pattern.compile("Татьян");

        Scanner scanner = new Scanner(new File("pushkin.txt"));
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            Matcher matcher = pattern.matcher(line);
            while (matcher.find()) {
                System.out.println(line.substring(matcher.start(), matcher.end()));
            }
        }
        scanner.close();

    }
}
