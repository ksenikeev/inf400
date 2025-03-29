package ru.itis.inf400.lab2_04;

public interface Set400<T> {

    int size();

    boolean contains(T element);

    void add(T element);

    T[] getAll(T[] a);

    T remove(T element);
}
