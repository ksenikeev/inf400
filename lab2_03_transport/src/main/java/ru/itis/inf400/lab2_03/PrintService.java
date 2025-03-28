package ru.itis.inf400.lab2_03;

public class PrintService {
    public void printNumbers(List400<? extends Transport> transports) {
        for (int i = 0; i < transports.size(); i++) {
            Transport transport = transports.get(i);
            System.out.println(transport.getNumber() + " " +
                    transport.workTimeBegin);
        }
    }
    public <T extends Transport> void printNumbers1(List400<T> transports) {
        for (int i = 0; i < transports.size(); i++) {
            Transport transport = transports.get(i);
            System.out.println(transport.getNumber() + " " +
                    transport.workTimeBegin);
        }
    }
}
