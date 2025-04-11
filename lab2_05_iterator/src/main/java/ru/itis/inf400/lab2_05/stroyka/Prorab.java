package ru.itis.inf400.lab2_05.stroyka;

import java.util.Iterator;

public class Prorab implements Iterable<Boolean> {

    private Stroyka stroyka;
    private int stage;

    public Prorab() {
        stroyka = new Stroyka();
        stage = 0;
    }

    @Override
    public Iterator<Boolean> iterator() {
        return new Iterator<Boolean>() {
            @Override
            public boolean hasNext() {
                return stage < 5;
            }

            @Override
            public Boolean next() {
                return switch (stage++) {
                    case 0 -> stroyka.project();
                    case 1 -> stroyka.foundation();
                    case 2 -> stroyka.walls();
                    case 3 -> stroyka.roof();
                    case 4 -> stroyka.decoration();
                    default -> throw new IllegalStateException();
                };
            }
        };
    }
}
