package ru.itis.inf400.lab2_05.iterablemap;

public class Main {
    public static void main(String[] args) {
        Map400<Integer, String> map = new MapImpl<>();

        map.put(1,"1");
        map.put(2,"2");
        map.put(3,"3");
        map.put(4,"4");

        map.put(33,"33");
        map.put(34,"34");
        map.put(35,"35");
        map.put(36,"36");

        for(Map400.Entry<Integer, String> entry : map) {
            System.out.println(entry);
        }
    }
}
