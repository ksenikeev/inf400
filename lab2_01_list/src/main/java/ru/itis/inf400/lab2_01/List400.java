package ru.itis.inf400.lab2_01;

public interface List400 {

    Integer get(int position);

    void add(Integer element);

    void add(Integer element, int position);

    Integer remove(int position);

    int size();

    void sort(boolean asc);
}
