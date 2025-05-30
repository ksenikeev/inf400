package ru.itis.inf400.lab2_14;

import java.io.Serializable;

public class Song implements Serializable {
    private String name;
    private String author;
    private String path;

    public Song() {
    }

    public Song(String name, String author, String path) {
        this.name = name;
        this.author = author;
        this.path = path;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

}
