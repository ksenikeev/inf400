package ru.itis.inf400.lab2_02.set;

public class Main {
    public static void main(String[] args) {
        Set400Impl<Car> set = new Set400Impl<>();

        set.add(new Car("X5", Color.BLACK, 2020));
        set.add(new Car("Zafira", Color.WHITE, 2012));
        set.add(new Car("GT", Color.BLACK, 2021));
        set.add(new PoliceCar("Zafira", Color.WHITE, 2012));

        System.out.println(set);

        System.out.println(new Car("X5", Color.BLACK, 2020).hashCode());
        System.out.println(new Car("X5", Color.BLACK, 2020).hashCode());

        Car car1 = new Car("X5", Color.BLACK, 2020);
        Car car2 = new Car("X5", Color.BLACK, 2020);
        System.out.println(car1 == car2);
    }
}
