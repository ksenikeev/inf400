package ru.itis.inf400.lab2_11.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

@Getter@Setter@ToString
public class Person  implements Serializable {
    private String gender;
    private Date birthdate;
    private String name;
}
