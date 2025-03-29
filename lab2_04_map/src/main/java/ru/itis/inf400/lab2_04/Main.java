package ru.itis.inf400.lab2_04;

public class Main {
    public static void main(String[] args) {
        Map400<Integer, String> map = new MapImpl<>();

        map.put(1,"один");
        map.put(1,"один 1");
        map.put(1,"один 2");

        System.out.println(map.get(1));
    }
}
