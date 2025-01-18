package ru.itis.inf400.lab16;

import java.util.InputMismatchException;
import java.util.Scanner;

public class TestException1 {

    public static void main(String[] args) {

        int n = 0;
        double f = 0;
        boolean inputMismatch = true;

        while (inputMismatch) {
            try {
                f = NumberSource.input();
                n = 1 / (int) f;

                inputMismatch = false;
            } catch (InputMismatchException e) {
                System.out.println("Вы ввели число в неверном формате, повторите ввод");
            } catch (ArithmeticException e) {
                System.out.println("Вы ввели 0, повторите ввод");
            } catch (NumberEq0Exception e) {
                System.out.println(e.getMessage());
            }
        }


        System.out.println(n);

    }

}
