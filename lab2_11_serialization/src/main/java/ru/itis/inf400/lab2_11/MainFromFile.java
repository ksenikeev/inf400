package ru.itis.inf400.lab2_11;

import ru.itis.inf400.lab2_11.model.Booking;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class MainFromFile {
    public static void main(String[] args) {
        try (ObjectInputStream ois
                = new ObjectInputStream(new FileInputStream("booking.obj"))) {

            Booking booking = (Booking) ois.readObject();

            System.out.println(booking);
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
