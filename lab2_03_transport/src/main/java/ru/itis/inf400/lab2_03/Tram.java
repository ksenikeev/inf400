package ru.itis.inf400.lab2_03;

public class Tram extends Transport {
    public Tram(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        super(number, routeNumber, workTimeBegin, workTimeEnd);
    }
    @Override
    public String toString() {
        return "Трамвай " + number + ", " + routeNumber + " Начало работы: "
                + workTimeBegin + " Конец работы: " + workTimeEnd;
    }
}
