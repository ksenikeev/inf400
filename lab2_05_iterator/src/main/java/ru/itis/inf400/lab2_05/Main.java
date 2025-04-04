package ru.itis.inf400.lab2_05;

public class Main {
    public static void main(String[] args) {
        int[] a = new int[]{1,2,3,4,5};

        for (int n : a) {
            System.out.println(n);
        }

        List400<Integer> lst = new ArrayListImpl<>();
        lst.add(1);
        lst.add(2);
        lst.add(3);

        for (int n : lst) {
            System.out.println(n);
        }

    }
}
