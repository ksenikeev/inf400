package ru.itis.inf400.lab2_03;

public class Orange extends Fruit {

    private String variety;

    public Orange(Integer sugar, Integer avg, String variety) {
        super(sugar, avg);
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }
}
