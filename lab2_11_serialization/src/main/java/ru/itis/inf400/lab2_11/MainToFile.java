package ru.itis.inf400.lab2_11;

import ru.itis.inf400.lab2_11.model.Booking;
import ru.itis.inf400.lab2_11.model.Hotel;
import ru.itis.inf400.lab2_11.model.Person;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class MainToFile {
    public static void main(String[] args) throws ParseException {
        Booking booking = new Booking();
        booking.setId(1);
        Date arrivalDate = new Date();
        booking.setArrivaldate(arrivalDate);
        booking.setStayingdate(new Date(arrivalDate.getTime() + 24*60*60*1000));

        Person person = new Person();
        person.setGender("М");
        person.setBirthdate(new SimpleDateFormat("dd.MM.yyyy").parse("12.03.1986"));
        person.setName("Аркадий");

        booking.setPerson(person);

        Hotel hotel = new Hotel();
        hotel.setId(1);
        hotel.setName("Гостинка");

        booking.setHotel(hotel);

        System.out.println(booking);

        try (FileOutputStream fos = new FileOutputStream("booking.obj");
             ObjectOutputStream oos = new ObjectOutputStream(fos)) {
            oos.writeObject(booking);
            oos.flush();
         } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
