package ru.itis.inf400.lab2_09;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class MainDataOutput {

    public static void main(String[] args) {

        long[] array = {1,2,3,4,5,6,7,8};
        String fileName = "longdata.long";
        fileLongEncoder(array, fileName);

        long[] a = fileLongDecoder(fileName);
        for (long l : a) {
            System.out.println(l);
        }
    }

    public static void fileLongEncoder(long[] array, String fileName) {
        try(FileOutputStream fos = new FileOutputStream(fileName);
            DataOutputStream dos = new DataOutputStream(fos)) {
            for (long a : array) {
                dos.writeLong(a);
            }
            dos.flush();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static long[] fileLongDecoder(String fileName) {
        List<Long> tmp = new ArrayList<>();
        try (FileInputStream fis = new FileInputStream(fileName);
            DataInputStream dis = new DataInputStream(fis)) {
            while (true) {
                try {
                    long l = dis.readLong();
                    tmp.add(l);
                } catch (EOFException e) {
                    System.out.println("Завершили чтение");
                    break;
                }
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        return tmp.stream().mapToLong(l -> l).toArray();
    }


}
