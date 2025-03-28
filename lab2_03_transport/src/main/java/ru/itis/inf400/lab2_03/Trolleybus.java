package ru.itis.inf400.lab2_03;

public class Trolleybus extends Transport {
    public Trolleybus(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        super(number, routeNumber, workTimeBegin, workTimeEnd);
    }
    @Override
    public String toString() {
        return "Троллейбус " + number + ", " + routeNumber + " Начало работы: "
                + workTimeBegin + " Конец работы: " + workTimeEnd;
    }
}
