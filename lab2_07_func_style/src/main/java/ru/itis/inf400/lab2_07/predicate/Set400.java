package ru.itis.inf400.lab2_07.predicate;

import java.util.function.Predicate;

public interface Set400<T> extends Iterable<T> {

    int size();

    boolean contains(T element);

    void add(T element);

    T[] getAll(T[] a);

    T remove(T element);

    Set400<T> filter(Predicate<T> predicate);
}
