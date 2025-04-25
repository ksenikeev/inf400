package ru.itis.inf400.lab2_08.booking;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.stream.Collectors;

public class Main2 {
//    Вывести список гостиниц и кол-во бронирований женщинами
    public static void main(String[] args) throws Exception {
        Bookings bookings = ParseBookings.parse();

        // printHostelsAndWomen(bookings);
        /*printSamaraPeople(bookings);

        print40oldPeople(bookings);*/
        //printCityCount(bookings);
        printUniquePeople(bookings);
    }

    public static void printHostelsAndWomen(Bookings bookings) {
        bookings.getBookings().stream()
                .filter(b -> b.getPerson().getGender() != null)
                .filter(b -> b.getPerson().getGender().equals("Female"))
                .collect(Collectors.toMap(
                        b -> b.getHotel().getName(),
                        b -> 1,
                        (v1, v2) -> v1 + v2))
                .entrySet()
                .forEach(b -> System.out.println(b.getKey() + " " + b.getValue()));
    }

    public static void printSamaraPeople(Bookings bookings) {
        long count = bookings
                .getBookings()
                .stream()
                .filter(b -> b.getPerson().getFromcity().contains("Самар"))
                .count();

        System.out.println(((double)count / bookings.getBookings().size()) * 100);
    }

    public static void print40oldPeople(Bookings bookings) throws ParseException {
        Date minus40 = new SimpleDateFormat("dd.MM.yyyy").parse("25.04.1985");
        Date minus45 = new SimpleDateFormat("dd.MM.yyyy").parse("25.04.1980");
        long count = bookings.getBookings()
                .stream()
                .filter(c -> c.getPerson().getBirthdate() != null)
                .filter(c -> c.getPerson().getBirthdate().before(minus40))
                .filter(c -> c.getPerson().getBirthdate().after(minus45))
                .count();
        System.out.println(((float)count / bookings.getBookings().size()) * 100);

    }
    public static void printCityCount(Bookings bookings) {
        bookings.getBookings().stream()
                .collect(Collectors.toMap(
                        b -> b.getPerson().getFromcity(),
                        b -> 1,
                        (v1, v2) -> v1 + v2))
                .entrySet()
                .stream()
                .sorted((e1,e2)->e2.getValue() - e1.getValue())
                .forEach(b -> System.out.println(b.getKey() + " " + b.getValue()));
    }

    public static void printUniquePeople(Bookings bookings) {
        long count = bookings.getBookings().stream()
                .map(b -> b.getPerson())
                .filter(b -> b.getGender() != null)
                .filter(b -> b.getBirthdate() != null)
                .distinct().count();
        System.out.println(((float)count / bookings.getBookings().size()) * 100);
    }



}
