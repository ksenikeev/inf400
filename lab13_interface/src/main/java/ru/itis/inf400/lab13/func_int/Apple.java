package ru.itis.inf400.lab13.func_int;

public class Apple implements ICompareObject {
    private int price;
    private String kind;

    public Apple() {}

    public Apple(int price, String kind) {
        this.price = price;
        this.kind = kind;
    }

    public int getPrice() {
        return price;
    }

    public String getKind() {
        return kind;
    }

    @Override
    public int compare(Object var1, Object var2) {
        return ((Apple)var1).getPrice() - ((Apple)var1).getPrice();
    }
}
