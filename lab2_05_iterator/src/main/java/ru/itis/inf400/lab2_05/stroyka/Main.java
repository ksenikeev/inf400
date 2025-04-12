package ru.itis.inf400.lab2_05.stroyka;

import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        Prorab prorab = new Prorab();

/*
        Iterator<Boolean> iterator = prorab.iterator();
        while (iterator.hasNext()) {
            iterator.next();
        }

        for(Boolean b : prorab) {
        }
*/

        prorab.forEach(b -> {});


        Consumer<Boolean> consumer = new Consumer<Boolean>() {
            public void accept(Boolean b) {

            }
        };

    }
}
