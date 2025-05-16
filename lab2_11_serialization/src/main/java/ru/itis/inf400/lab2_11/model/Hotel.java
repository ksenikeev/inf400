package ru.itis.inf400.lab2_11.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Setter@Getter@ToString
public class Hotel  implements Serializable {
    private Integer id;
    private String name;
}
