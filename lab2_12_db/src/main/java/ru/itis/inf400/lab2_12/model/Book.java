package ru.itis.inf400.lab2_12.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;

@Getter@Setter
public class Book implements Serializable {
    private Integer id;
    private String name;
    private Date createDate;
    private String author;

    public Book() {}

    public Book(Integer id, String name, Date createDate, String author) {
        this.id = id;
        this.name = name;
        this.createDate = createDate;
        this.author = author;
    }
}
