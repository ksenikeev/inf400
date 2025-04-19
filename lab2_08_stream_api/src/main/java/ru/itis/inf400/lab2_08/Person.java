package ru.itis.inf400.lab2_08;

import java.util.Date;

public class Person {
    private String name;
    private Integer age;
    private Date date;
    public Person(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public Integer getAge() {
        return age;
    }

    public String toString() {
        return name;
    }


}
