package model;

public class Pizza {
     private String name;
     private float weight;
     private float price;
     private float size;
     private Ingredient[] ingredients;

     public Pizza() {}

    public Pizza(String name, float weight, float price, float size, Ingredient[] ingredients) {
         this.name = name;
         this.weight = weight;
         this.price = price;
         this.size = size;
         this.ingredients = ingredients;
    }

    public void setName(String name) {
         this.name = name;
     }

    public void setWeight(float weight) {
         this.weight = weight;
     }

    public void setPrice(float price) {
         this.price = price;
    }

    public void setSize(float size) {
         this.size = size;
    }

    public void setIngredients(Ingredient[] ingredients) {
         this.ingredients = ingredients;
    }

    public String getName() {
         return name;
    }

    public float getWeight(){
         return weight;
    }

    public float getPrice(){
         return price;
    }

    public float getSize(){
         return size;
    }

    public Ingredient[] getIngredients() {
        return ingredients;
    }
}