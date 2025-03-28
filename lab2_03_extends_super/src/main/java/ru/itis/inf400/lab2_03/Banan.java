package ru.itis.inf400.lab2_03;

public class Banan {
    protected Integer sugar;
    protected Integer avg;
    private String variety;

    public Banan(Integer sugar, Integer avg, String variety) {
        this.sugar = sugar;
        this.avg = avg;
        this.variety = variety;
    }

    public String getVariety() {
        return variety;
    }

    public Integer getSugar() {
        return sugar;
    }

    public Integer getAvg() {
        return avg;
    }
}
