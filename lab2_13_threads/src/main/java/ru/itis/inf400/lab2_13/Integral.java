package ru.itis.inf400.lab2_13;

import java.util.function.Consumer;

public class Integral implements Consumer<Double>{

    private volatile double result = 0d;

    public static void main(String[] args) throws InterruptedException {

        new Integral().startCalculate();


        new Integral().partSumm(1,2);
    }

    public void startCalculate() throws InterruptedException {
        // Узнаем кол-во доступных в системе потоков
        // [1,2]
        int countProc = Runtime.getRuntime().availableProcessors();
        double h = (2. - 1.) / countProc;

        // Здесь будем запоминать ссылки на потоки
        Thread[] threads = new Thread[countProc];
        for (int i = 0; i < countProc; ++i) {
            threads[i] = new Thread(new TaskPartCalc(1 + i*h, 1 + (i+1)*h, this));
            threads[i].start();
        }
        // Переведем этот поток в режим ожидания завершения дочерних потоков
        for (int i = 0; i < countProc; ++i) {
            threads[i].join();
        }
        System.out.println(result);
    }

    public void accept(Double part) {
        synchronized (this) {
            result += part;
        }
    }

    public double func(double x) {
        return Math.exp(-x)*Math.sin(x);
    }

    public double partSumm(double a, double b) {
        int N = 1000;
        double sum = 0;
        double h = (b - a) / N;
        for (int i = 0; i < N; ++i) {
            sum += h * (func(a + i * h) + func(a + (i + 1) * h)) / 2;
        }
        return sum;
    }

    class TaskPartCalc implements Runnable {

        private double a;
        private double b;
        private Consumer<Double> consumer;

        public TaskPartCalc(double a, double b, Consumer<Double> consumer) {
            this.a = a;
            this.b = b;
            this.consumer = consumer;
        }

        public void run() {
            double result = partSumm(a, b);
            consumer.accept(result);
        }
    }
}
