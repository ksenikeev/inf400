package ru.itis.inf400.lab13.compare;

public class Person implements CanCompare {

    private String name;
    private int age;
    private String gender;
    private int iq;

    public Person(String name, int age, String gender, int iq) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.iq = iq;
    }

    public int compare(CanCompare otherPerson) {
        if (iq == ((Person)otherPerson).iq) {
            return - (age - ((Person)otherPerson).age);
        } else {
            return iq - ((Person)otherPerson).iq;
        }
    }

    public String toString() {
        return name;
    }
}
