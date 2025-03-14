package ru.itis.inf400.lab17.integral;

public class Sin implements ICalculator {

    @Override
    public double calculate(double x) {
        return Math.sin(x);
    }
}
