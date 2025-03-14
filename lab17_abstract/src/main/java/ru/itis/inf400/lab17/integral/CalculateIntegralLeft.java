package ru.itis.inf400.lab17.integral;

public class CalculateIntegralLeft extends AbstractCalculateIntegral {
    public CalculateIntegralLeft(double a, double b, ICalculator function) {
        super(a, b, function);
    }

    @Override
    public double calculateS(int i) {
        double h = (b - a) / N;
        return h * function.calculate(a + h * i);
    }
}
