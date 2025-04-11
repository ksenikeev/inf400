package ru.itis.inf400.lab2_05.menu;

import java.util.Iterator;

public class MenuMain {
    public static void main(String[] args) {
        Lunch lunch = new Lunch();

/*
        for (String s : lunch) {
            System.out.println(s);
        }
*/

        Iterator<String> iterator = lunch.iterator();
        System.out.println(iterator.next());
        lunch.setMonday("Творог");
        iterator = lunch.iterator();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.next());
    }
}
