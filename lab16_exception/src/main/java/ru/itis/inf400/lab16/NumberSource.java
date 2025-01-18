package ru.itis.inf400.lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class NumberSource {

    public static double input() throws NumberEq0Exception,
            ArithmeticException, InputMismatchException {
        Scanner scanner = new Scanner(System.in);
        double f = scanner.nextDouble();

        if ((int)f == 0) {
            throw new NumberEq0Exception();
        }
        return f;
    }

}
