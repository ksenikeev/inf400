package ru.itis.inf400.lab17.integral;

public abstract class AbstractCalculateIntegral {
    protected double a;
    protected double b;
    protected ICalculator function;
    public static final int N = 1000;
    public AbstractCalculateIntegral(double a, double b, ICalculator function){
        this.a = a;
        this.b = b;
        this.function = function;
    }
    public double calculateIntegral() {
        double sum = 0;
        double h = (b - a) / N;
        for(int i = 0; i < N; i++) {
            sum += calculateS(i);
        }
        return sum;
    }

    public abstract double calculateS(int i);
}
