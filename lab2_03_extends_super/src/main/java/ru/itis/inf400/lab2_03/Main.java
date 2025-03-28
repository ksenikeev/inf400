package ru.itis.inf400.lab2_03;

public class Main {
    public static void main(String[] args) {
        Fruit fruit = new Fruit(10, 30);
        Orange orange = new Orange(5, 70, "Красный");
        Apple apple = new Apple(5, 60, "Гала");

        Banan banan = new Banan(20, 100, "");

        FruitUtil fruitUtil = new FruitUtil();

        System.out.println(fruitUtil.calculateSugar(fruit));
        System.out.println(fruitUtil.calculateSugar(orange));
        System.out.println(fruitUtil.calculateSugar(apple));
        //System.out.println(fruitUtil.calculateSugar(banan));
    }
}
