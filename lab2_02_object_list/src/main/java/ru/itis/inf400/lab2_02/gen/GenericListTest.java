package ru.itis.inf400.lab2_02.gen;

public class GenericListTest {
    public static void main(String[] args) {
        testAdd();
        testGet();
    }

    public static void testAdd() {
        ArrayListImpl<Integer> arrayList = new ArrayListImpl();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList);
    }

    public static void testGet() {
        ArrayListImpl<Integer> arrayList = new ArrayListImpl();

        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);

        System.out.println(arrayList.get(2) + arrayList.get(1));
    }

}
