package ru.itis.inf400.lab2_02;

public interface List400 {

    Object get(int position);

    void add(Object element);

    void add(Object element, int position);

    Object remove(int position);

    int size();

    //void sort(boolean asc);
}
