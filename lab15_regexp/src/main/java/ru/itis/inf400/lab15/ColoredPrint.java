package ru.itis.inf400.lab15;

public class ColoredPrint {

    private static String RESET = "\u001B[0m";
    private static String RED = "\u001B[38;2;255;0;0m";

    public static void print(String s, int start, int end) {
        System.out.print(s.substring(0, start));
        System.out.print(RED);
        System.out.print(s.substring(start, end));
        System.out.print(RESET);
        System.out.println(s.substring(end));
    }
}
