package ru.itis.inf400.lab2_08.booking;


import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class ParseBookings {

    public Bookings parse() throws IOException {
        ObjectMapper mapper = new ObjectMapper();
        Bookings bookings = mapper
                .readValue(new File("bookings.json"), Bookings.class);
        return bookings;
    }

}
