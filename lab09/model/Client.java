package model;

public class Client {
    private String name;
    private int discount;

    public Client(){}

    public Client(String name, int discount) {
        this.name = name;
        this.discount = discount;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public String getName() {
        return name;
    }

    public int getDiscount() {
        return discount;
    }
}