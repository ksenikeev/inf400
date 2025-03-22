package ru.itis.inf400.lab2_02.set;

public class Main {
    public static void main(String[] args) {
        Set400Impl<Car> set = new Set400Impl<>();

        set.add(new Car("X5", Color.BLACK, 2020));
        set.add(new Car("Zafira", Color.WHITE, 2012));
        set.add(new Car("GT", Color.BLACK, 2021));
        set.add(new PoliceCar("Zafira", Color.WHITE, 2012));

        Car[] cars = set.getAll(new Car[0]);

        for(Car car : cars) {
            System.out.println(car);
        }
    }
}
