package ru.itis.inf400.lab2_08.booking;

import java.io.IOException;
import java.util.List;
import java.util.Map;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) throws IOException {
        Bookings bookings = ParseBookings.parse();

        System.out.println(bookings.getBookings().size());
        countMen(bookings);
        cities(bookings);
        printCountGuestsInHotel(bookings);
        printCountGuestsInCities(bookings);


    }
    // посчитать кол-во мужчин забронировавших гостиницу
    public static void countMen(Bookings bookings) {
        long result = bookings.getBookings()
                .stream()
                .filter(s -> s.getPerson().getGender() != null && s.getPerson().getGender().equals("Male")
                )
                .count();
        System.out.println(result);
    }

    // вывести список разных насел пунктов
    public static void cities(Bookings bookings) {
        List<String> cities = bookings.getBookings().stream()
                .map(p -> p.getPerson().getFromcity())
                .distinct()
                .toList();
        cities.forEach(System.out::println);
    }

    /*
    Посчитать количество гостей из каждого отеля
     */
    public static void printCountGuestsInHotel(Bookings bookings) {
         Map<String, Integer> result = bookings
                .getBookings()
                .stream()
                 // преобразуем в MAP для этого нам надо сказать, что будет ключем, что значением
                .collect(Collectors
                        .toMap(
                                // Определяем ключ
                                booking -> booking.getHotel().getName(),
                                // Определяем значение (для каждой брони ставим 1)
                                booking -> 1,
                                // разруливаем конфликт одинаковых ключей, берем сумму из старого
                                // и нового значения
                                (a, b) -> a + b));

        result.forEach((s1, s2) -> System.out.println(s1 + " " + s2));
    }

    // вывести список населенных пунктов и кол-во гостей из них
    public static void printCountGuestsInCities(Bookings bookings) {
        bookings
                .getBookings()
                .stream()
                // преобразуем в MAP для этого нам надо сказать, что будет ключем, что значением
                .collect(Collectors
                        .toMap(
                                // Определяем ключ
                                booking -> booking.getPerson().getFromcity(),
                                // Определяем значение (для каждой брони ставим 1)
                                booking -> 1,
                                // разруливаем конфликт одинаковых ключей, берем сумму из старого
                                // и нового значения
                                (a, b) -> a + b)).entrySet()
                .stream()
                .sorted((a, b) -> b.getValue() - a.getValue())
                .forEach(s -> System.out.println(s.getKey() + " " + s.getValue()));
    }

    public static void printCountGuestsInCities2(Bookings bookings) {
   /*     Map<String, List<Booking>> mp = bookings
                .getBookings()
                .stream()
                // преобразуем в MAP для этого нам надо сказать, что будет ключем, что значением
                .collect(Collectors.groupingBy(booking -> ((Booking)booking).getPerson().getFromcity()))
                .entrySet().stream().map(e -> new Entry);
*/    }
}

