package ru.itis.inf400.lab17;

public class CalculateIntegralLeft extends AbstractCalculateIntegral {
    public CalculateIntegralLeft(double a, double b, ICalculator function) {
        super(a, b, function);
    }

    @Override
    public double calculateS(int i) {
        double h = (b - a) / N;
        return function.calculate(a + h * i);
    }
}
