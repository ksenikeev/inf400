package ru.itis.inf400.lab2_02.gen;

public interface List400<T> {

    T get(int position);

    void add(T element);

    void add(T element, int position);

    T remove(int position);

    int size();

    //void sort(boolean asc);
}
