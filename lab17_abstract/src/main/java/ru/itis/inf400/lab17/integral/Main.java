package ru.itis.inf400.lab17.integral;

public class Main {
    public static void main(String[] args) {
        CalculateIntegralLeft calculateIntegralLeft =
                new CalculateIntegralLeft(0, Math.PI / 2, new Sin());
        System.out.println(calculateIntegralLeft.calculateIntegral());
    }
}
