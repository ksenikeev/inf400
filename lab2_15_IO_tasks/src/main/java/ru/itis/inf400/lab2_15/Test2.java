package ru.itis.inf400.lab2_15;

import java.io.*;

public class Test2 {

    public static void main(String[] args) {
        solution("git.md");
    }
    public static void solution(String inputFile) {
        try(FileInputStream fis = new FileInputStream(inputFile);
        ByteArrayOutputStream bos = new ByteArrayOutputStream()) {
            int r;
            while((r = fis.read()) > 0) {
                bos.write(r);
            }
            byte[] bytes = bos.toByteArray();
            int[] arr = toArray(bytes);
            for (int i = 0; i < 256; i++) {
                System.out.print(i + ":");
                for(int j = 0; j < arr[i]; j++)
                    System.out.print("O");
                System.out.println();
            }



        }catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static int[] toArray(byte[] bytes) {
        int[] array = new int[256];
        for (byte b : bytes) {
            array[b & 0xff]++;
        }
        return array;
    }
}
