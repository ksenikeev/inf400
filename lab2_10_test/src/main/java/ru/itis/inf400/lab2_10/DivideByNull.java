package ru.itis.inf400.lab2_10;

public class DivideByNull extends Exception {
    public DivideByNull(String message) {
        super(message);
    }

    public DivideByNull() {
        super();
    }
}
