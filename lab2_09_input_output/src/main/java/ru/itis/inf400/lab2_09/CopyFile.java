package ru.itis.inf400.lab2_09;

import java.io.*;
import java.util.Scanner;

public class CopyFile {
    private String inputFile;
    private String outputFile;

    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите имя файла");
        inputFile = sc.nextLine();
        System.out.println("Введите имя файла для записи");
        outputFile = sc.nextLine();
        File file = new File(inputFile);
        if (!(file.isFile() && file.exists())){
            throw new RuntimeException("Файла не существует");
        }

    }
    public void copy() {
        try(InputStream fis = new FileInputStream(inputFile);
            OutputStream fos = new FileOutputStream(outputFile)) {
            byte[] buffer = new byte[1024];
            int r;
            while ((r = fis.read(buffer)) > 0) {
                fos.write(buffer, 0, r);
            }
        } catch (IOException e) {
            e.printStackTrace();

        }
    }

    public static void main(String[] args) {
        CopyFile copyFile = new CopyFile();
        copyFile.input();
        copyFile.copy();
    }
}
