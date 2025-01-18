package ru.itis.inf400.lab16;

public class NumberEq0Exception extends Exception {

    public NumberEq0Exception() {
        super("Целая часть числа равна 0");
    }

    public NumberEq0Exception(String message) {
        super(message);
    }

}
