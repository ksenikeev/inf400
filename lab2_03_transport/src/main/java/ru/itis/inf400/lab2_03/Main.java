package ru.itis.inf400.lab2_03;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        PrintService printService = new PrintService();
        TransportService service = new TransportService();
        try {
            //List400<Transport> list = service.load(TransportService.FILENAME);
            List400<Bus> list = service.loadBus(TransportService.FILENAME);
            printService.printNumbers(list);

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }


    }
}
