package ru.itis.inf400.lab2_02.gen;

public class ObjectListTest {
    public static void main(String[] args) {
        testAdd();
        testGet();
    }

    public static void testAdd() {
        ArrayListImpl arrayList = new ArrayListImpl();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);
    }

    public static void testGet() {
        ArrayListImpl arrayList = new ArrayListImpl();

        arrayList.add(1);
        arrayList.add("2");
        arrayList.add(3);

        System.out.println((int)(arrayList.get(2)) + (int)(arrayList.get(1)));
    }

}
