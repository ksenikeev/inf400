package ru.itis.inf400.lab2_01;

public class ArrayListImpl implements List400{
    private Integer[] values;
    private int size;

    public ArrayListImpl(){
        size = 0;
        values = new Integer[10];
    }

    public Integer get(int position) throws IndexOutOfBoundsException{
        if (position < 0 || position >= size)
            throw new IndexOutOfBoundsException();
        return values[position];
    }

    public void add(Integer element) {
        extendValuesArray();
        values[size++] = element;
    };

    private void extendValuesArray(){
        if (size == values.length + 1){
            Integer[] temp = new Integer[(int)(values.length*1.5)];
            for (int i = 0; i < values.length; i++){
                temp[i] = values[i];
            }
            values = temp;
        }
    }

    public void add(Integer element, int position) throws IndexOutOfBoundsException{
        if (position < 0 || position > size)
            throw new IndexOutOfBoundsException();
        extendValuesArray();
        for (int i = size; i > position; i--){
            values[i] = values[i - 1];
        }
        values[position] = element;
        size++;
    }

    public Integer remove(int position){
        if (position < 0 || position >= size)
            throw new IndexOutOfBoundsException();
        Integer temp = values[position];
        for (int i = position; i < size-1; i++){
            values[i] = values[i + 1];
        }
        size--;
        return temp;
    };

    public int size(){
        return size;
    };

    void sort(boolean asc);
}
