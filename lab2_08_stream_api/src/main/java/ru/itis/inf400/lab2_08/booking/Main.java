package ru.itis.inf400.lab2_08.booking;

import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        Bookings bookings = ParseBookings.parse();

        System.out.println(bookings.getBookings().size());
    }
}
