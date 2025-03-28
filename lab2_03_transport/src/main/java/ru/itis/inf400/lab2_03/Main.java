package ru.itis.inf400.lab2_03;

import java.io.FileNotFoundException;

public class Main {
    public static void main(String[] args) {
        TransportService service = new TransportService();
        try {
            //List400<Transport> list = service.load(TransportService.FILENAME);
            List400<Trolleybus> list = service.loadTrolleyBus(TransportService.FILENAME);
            System.out.println(list);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }
}
