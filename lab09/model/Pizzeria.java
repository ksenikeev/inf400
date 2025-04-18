package model;

public class Pizzeria {
    private String name;
    private String address;
    private int rating;

    public Pizzeria() {}

    public Pizzeria(String name, String address, int rating) {
        this.name = name;
        this.address = address;
        this.rating = rating;
    }

    public int getRating() {
        return rating;
    }

    public String getAddress() {
        return address;
    }

    public String getName() {
        return name;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}