package ru.itis.inf400.lab2_05.menu;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class Lunch implements Iterable<String> {
    private String monday;
    private String tuesday;
    private String wednesday;
    private String thursday;

    private boolean isModify;

    public Lunch() {
        monday = "curd";
        tuesday = "omelet";
        wednesday = "porridge";
        thursday = "toast";
        isModify = false;
    }

    public Iterator<String> iterator() {
        return new LunchIterator();
    }

    class LunchIterator implements Iterator<String> {

        int counter = 0;

        LunchIterator() {
            isModify = false;
        }

        @Override
        public boolean hasNext() {
            return counter < 4;
        }

        @Override
        public String next() {
            if (isModify) throw new IllegalStateException("Структура была изменена");
            return switch (counter++) {
                case 0 -> monday;
                case 1 -> tuesday;
                case 2 -> wednesday;
                case 3 -> thursday;
                default -> throw new NoSuchElementException();
            };
        }
    }

    public void setMonday(String monday) {
        isModify = true;
        this.monday = monday;
    }

    public void setTuesday(String tuesday) {
        isModify = true;
        this.tuesday = tuesday;
    }

    public void setWednesday(String wednesday) {
        isModify = true;
        this.wednesday = wednesday;
    }

    public void setThursday(String thursday) {
        isModify = true;
        this.thursday = thursday;
    }
}
