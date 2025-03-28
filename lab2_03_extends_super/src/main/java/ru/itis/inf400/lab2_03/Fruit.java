package ru.itis.inf400.lab2_03;

public class Fruit {
    protected Integer sugar;
    protected Integer avg;

    public Fruit(Integer sugar, Integer avg) {
        this.sugar = sugar;
        this.avg = avg;
    }

    public Integer getSugar() {
        return sugar;
    }

    public Integer getAvg() {
        return avg;
    }
}
