package ru.itis.inf400.lab2_02;

public class ArrayListImpl implements List400 {
    private Object[] values;
    private int size;

    public ArrayListImpl() {
        size = 0;
        values = new Object[10];
    }

    public Object get(int position) throws IndexOutOfBoundsException{
        if (position < 0 || position >= size)
            throw new IndexOutOfBoundsException();
        return values[position];
    }

    public void add(Object element) {
        extendValuesArray();
        values[size++] = element;
    };

    private void extendValuesArray(){
        if (size == values.length + 1){
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

    public void add(Object element, int position) throws IndexOutOfBoundsException {
        if (position < 0 || position > size)
            throw new IndexOutOfBoundsException();
        extendValuesArray();
        for (int i = size; i > position; i--) {
            values[i] = values[i - 1];
        }
        values[position] = element;
        size++;
    }

    public Object remove(int position) {
        if (position < 0 || position >= size)
            throw new IndexOutOfBoundsException();
        Object temp = values[position];
        for (int i = position; i < size-1; i++) {
            values[i] = values[i + 1];
        }
        size--;
        return temp;
    };

    public int size() {
        return size;
    };

    @Override
    public String toString() {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < size; ++i) {
            result.append(values[i]).append(" ");
        }
        return result.toString();
    }

    public void sort(boolean asc) {

    }
}
