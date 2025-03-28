package ru.itis.inf400.lab2_03;

public class FruitUtil<T extends Fruit> {

    public Double calculateSugar(T fruit) {
        return fruit.getSugar() * fruit.getAvg() / 100.0;
    }
}
