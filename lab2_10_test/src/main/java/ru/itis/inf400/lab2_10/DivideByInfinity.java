package ru.itis.inf400.lab2_10;

public class DivideByInfinity extends Exception {
    public DivideByInfinity(String message) {
        super(message);
    }

    public DivideByInfinity() {
        super();
    }
}
