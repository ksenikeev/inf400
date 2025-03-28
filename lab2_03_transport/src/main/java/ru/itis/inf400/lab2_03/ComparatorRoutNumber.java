package ru.itis.inf400.lab2_03;

import java.util.Comparator;

public class ComparatorRoutNumber implements Comparator<Transport> {
    @Override
    public int compare(Transport o1, Transport o2) {
        return o1.getRouteNumber().compareTo(o2.getRouteNumber());
    }
}
