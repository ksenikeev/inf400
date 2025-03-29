package ru.itis.inf400.lab2_04;

public class Main {
    public static void main(String[] args) {
        Map400<Integer, String> map = new MapImpl<>();

        System.out.println("size = " + map.size());
        map.put(1,"один");
        map.put(2,"два");
        System.out.println("size = " + map.size());
        map.put(1,"один 1");
        System.out.println("size = " + map.size());
        map.put(1,"один 2");
        System.out.println("size = " + map.size());
        System.out.println(map.remove(1));
        System.out.println("size = " + map.size());
        System.out.println(map.get(1));
    }
}
