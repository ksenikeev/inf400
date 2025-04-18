package model;

public class Ingredient {
    private String name;
    private int calories;

     public Ingredient() {}

    public Ingredient(String name, int calories) {
         this.name = name;
         this.calories = calories;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getCalories() {
        return calories;
    }

    public void setCalories(int calories) {
        this.calories = calories;
    }

}