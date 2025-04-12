package ru.itis.inf400.lab2_07;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ComparatorTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(2);
        list.add(4);
        list.add(10);
        list.add(11);
        list.add(8);

        list.sort(new Comparator<Integer>() {
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        list.sort((a, b) -> { return a - b;});

        list.sort((a, b) -> a - b);

        list.forEach(a -> {System.out.println(a);});

        list.forEach(System.out::println);
    }
}
