package ru.itis.inf400.lab2_03;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class TransportService {
    public final static String FILENAME = "transport.csv";
    public List400<Transport> load(String fileName) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File(fileName));
        if (scanner.hasNextLine()){
            scanner.nextLine();
        }
        List400<Transport> result = new ArrayListImpl<>();
        while (scanner.hasNextLine()) {
            String line = scanner.nextLine();
            String[] lineSet = line.split(";");
            Transport transport = switch (lineSet[0]) {
                case "bus" -> new Bus(lineSet[1], lineSet[2], lineSet[3], lineSet[4]);
                case "tram" -> new Tram(lineSet[1], lineSet[2], lineSet[3], lineSet[4]);
                case "trolleybus" -> new Trolleybus(lineSet[1], lineSet[2], lineSet[3], lineSet[4]);
                default -> null;
            };
            result.add(transport);
        }
        return result;
    }
}
