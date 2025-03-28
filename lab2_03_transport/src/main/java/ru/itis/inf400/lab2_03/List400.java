package ru.itis.inf400.lab2_03;

import java.util.Comparator;

public interface List400<T extends Comparable> {

    T get(int position);

    void add(T element);

    void add(T element, int position);

    T remove(int position);

    int size();

    void sort(Comparator<T> comparator, boolean asc);
}
