package ru.itis.inf400.lab2_06;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Graph {
    private Map<Character, Set<Character>> value;

    public Graph() {
        value = new HashMap<>();
        value.put('d', null);
        value.put('a', Set.of('d','c'));
        value.put('f', Set.of('d'));
        value.put('g', Set.of('d','c','f'));
        value.put('c', null);
        value.put('b', Set.of('f','g','a','c'));
    }
}
