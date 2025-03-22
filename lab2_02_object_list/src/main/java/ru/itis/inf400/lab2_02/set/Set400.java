package ru.itis.inf400.lab2_02.set;

public interface Set400<T> {

    int size();

    boolean contains(T element);

    void add(T element);

    T[] getAll(T[] a);

    T remove(T element);
}
