package ru.itis.inf400.lab2_03;

import java.util.Comparator;

public class ArrayListImpl<T extends Comparable<T>> implements List400<T> {
    private Object[] values;
    private int size;

    public ArrayListImpl() {
        size = 0;
        values = new Object[10];
    }

    @Override
    public T get(int position) throws IndexOutOfBoundsException{
        if (position < 0 || position >= size)
            throw new IndexOutOfBoundsException();
        return (T)values[position];
    }

    @Override
    public void add(T element) {
        extendValuesArray();
        values[size++] = element;
    };

    private void extendValuesArray(){
        if (size == values.length){
            Object[] temp = new Object[(int)(values.length*1.5)];

/*
            for (int i = 0; i < values.length; i++){
                temp[i] = values[i];
            }
*/

            System.arraycopy(values, 0, temp, 0, values.length);

            values = temp;
        }
    }

    @Override
    public void add(T element, int position) throws IndexOutOfBoundsException {
        if (position < 0 || position > size)
            throw new IndexOutOfBoundsException();
        extendValuesArray();
        for (int i = size; i > position; i--) {
            values[i] = values[i - 1];
        }
        values[position] = element;
        size++;
    }

    @Override
    public T remove(int position) {
        if (position < 0 || position >= size)
            throw new IndexOutOfBoundsException();
        T temp = (T)values[position];
        for (int i = position; i < size-1; i++) {
            values[i] = values[i + 1];
        }
        size--;
        return temp;
    };

    @Override
    public int size() {
        return size;
    };

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; ++i) {
            result.append(values[i]).append("\n");
        }
        return result.toString();
    }

    public void sort(Comparator<T> comparator, boolean asc) {
        T t1 = null;
        T t2 = null;

        if (comparator != null) {
            comparator.compare(t1, t2);
        } else {
            t1.compareTo(t2);
        }
    }
}
