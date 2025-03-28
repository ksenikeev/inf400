package ru.itis.inf400.lab2_03;

public class Bus extends Transport {
    public Bus(String number, String routeNumber, String workTimeBegin, String workTimeEnd) {
        super(number, routeNumber, workTimeBegin, workTimeEnd);
    }
    @Override
    public String toString() {
        return "Автобус " + number + ", " + routeNumber + " Начало работы: "
                + workTimeBegin + " Конец работы: " + workTimeEnd;
    }
}
