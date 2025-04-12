package ru.itis.inf400.lab2_07.predicate;

import java.lang.reflect.Array;
import java.util.Iterator;
import java.util.function.Predicate;

public class Set400Impl<T> implements Set400<T> {
    private T[] array;
    private int size;

    public Set400Impl() {}

    public Set400Impl(T element) {
        array = (T[]) new Object[10];
        array[0] = element;
        size = 1;
    }

    public Set400Impl(T[] array) {
        this.array = array;
        size = array.length;
    }

    @Override
    public Set400<T> filter(Predicate<T> predicate) {

        Set400<T> filtered = new Set400Impl<>();
        for (int i = 0; i < size; ++i) {
            if (predicate.test(array[i])) {
                filtered.add(array[i]);
            }
        }

        return filtered;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean contains(T element) {
        // Доступ за O(n), тк hashMap не знаю
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                return true;
            }
        }
        return false;
    }

    @Override
    public void add(T element) {
        if (array == null) {
            array = (T[]) new Object[10];
        } else if (contains(element)) {
            // O(n)
            return;
        }

        if (size == array.length) {
            extendArray();
        }
        array[size++] = element;
    }

    @Override
    public T[] getAll(T[] a) {
        //T[] copy = (T[])Arrays.copyOf(array, size, a.getClass());//

        T[] copy = (T[])Array.newInstance(a.getClass().componentType(), size);

        for (int i = 0; i < size; ++i) {
            copy[i] = (T)array[i];
        }

        System.out.println(array.getClass());
        System.out.println(copy.getClass());

        return copy;
    }

    @Override
    public T remove(T element) {
        for (int i = 0; i < size; i++) {
            if (array[i].equals(element)) {
                // сдвигаем следующие элементы назад
                for (int j = i + 1; j < size; j++) {
                    array[j - 1] = array[j];
                }
                size--;
                return element;
            }
        }
        return null;
    }

    private void extendArray() {
        T[] newArray = (T[]) new Object[(int) (array.length * 1.5)];
        System.arraycopy(array, 0, newArray, 0, array.length);
        array = newArray;
    }

    public String toString() {
        StringBuilder stringBuilder = new StringBuilder();
        for (int i = 0; i < size; i++) {
            stringBuilder.append(array[i]).append(" ");
        }
        return stringBuilder.toString();
    }


    @Override
    public Iterator<T> iterator() {
        return new SetIterator();
    }

    class SetIterator implements Iterator<T> {

        int current;

        public SetIterator() {
            this.current = 0;
        }

        @Override
        public boolean hasNext() {
            return current < size ;
        }

        @Override
        public T next() {
            return array[current++];
        }
    }
}