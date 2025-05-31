package ru.itis.inf400.lab2_15;

import java.io.*;

/*
1. Считать файл в масcив (использовать FileInputStream, ByteArrayInputStream),
отсортировать массив байт подсчетом, записать в новый файл. Для сортировки написать тест.
 */
public class Task1 {
    public static void main(String[] args) {
        solution("git.md", "git1.md");
    }

    public static void solution(String inputfile, String outputpath) {
        try (FileInputStream fis = new FileInputStream(inputfile);
        FileOutputStream fos = new FileOutputStream(outputpath)) {
            byte[] bytes = fis.readAllBytes();
            countingSort(bytes);
            fos.write(bytes);
            fos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void countingSort(byte[] array) {
        int[] count = new int[256];

        for (byte b : array) {
            count[b + 128]++;
        }

        int index = 0;
        for (int i = 0; i < count.length; i++) {
            while (count[i]-- > 0) {
                array[index] = (byte) (i - 128);
                index++;
            }
        }
    }
}
