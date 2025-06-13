package ru.itis.inf400.lab2_16.model;

public class Hotel {
    public static final String version = "1.0";

    protected String name;
    private Integer stars;
    private String address;

    public Hotel() {
    }

    public Hotel(String name, Integer stars, String address) {
        this.name = name;
        this.stars = stars;
        this.address = address;
    }

    private static String getVersion() {
        return version;
    }

    protected static String getVersion2() {
        return version;
    }

    static String getVersion3() {
        return version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getStars() {
        return stars;
    }

    public void setStars(Integer stars) {
        this.stars = stars;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Hotel{" +
                "name='" + name + '\'' +
                ", stars=" + stars +
                ", address='" + address + '\'' +
                '}';
    }
}
