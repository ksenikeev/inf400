package ru.itis.inf400.lab2_11.model;

import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter@Setter
public class Booking {
    private Integer id;
    private Date arrivaldate;
    private Date stayingdate;
    private Date departuredate;
    private Hotel hotel;
    private Person person;
}
