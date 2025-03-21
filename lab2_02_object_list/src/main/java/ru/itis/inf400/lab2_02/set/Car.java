package ru.itis.inf400.lab2_02.set;

public class Car {
    private String model;
    private Color color;
    private Integer productionYear;

    public Car(String model, Color color, Integer productionYear) {
        this.model = model;
        this.color = color;
        this.productionYear = productionYear;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public Integer getProductionYear() {
        return productionYear;
    }

    public void setProductionYear(Integer productionYear) {
        this.productionYear = productionYear;
    }

    @Override
    public String toString() {
        return model + ", " + color + ", " + productionYear;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null) return false;
        if (o.getClass() != this.getClass()) return false;
        if (this == o) return true;

        Car c = (Car) o;
        if (this.model.equals(c.model) &&
            this.color.equals(c.color) &&
            this.productionYear.equals(c.productionYear)
        )  return true;

        return false;
    }

    @Override
    public int hashCode() {
        int result = 17;
        for (int i = 0; i < model.length(); ++i) {
            result = result ^ model.charAt(i);
        }

        result *= productionYear;

        String c = color.name();

        for (int i = 0; i < c.length(); ++i) {
            result = result ^ c.charAt(i);
        }

        return result;
    }

}
