package ru.itis.inf400.lab2_11.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;
import java.util.Date;

@Getter@Setter@ToString
public class Booking implements Serializable {
    private Integer id;
    private Date stayingdate;
    private Date arrivaldate;
    private Date departuredate;
    private Hotel hotel;
    private Person person;
}
