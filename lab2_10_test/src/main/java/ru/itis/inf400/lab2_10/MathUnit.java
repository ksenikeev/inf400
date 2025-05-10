package ru.itis.inf400.lab2_10;

public class MathUnit {
    public static int sum(int a, int b) {
        return a + b;
    }

    /**
       return > 0, a > b
        0 , a = b
        < 0, a < b
     */
    public static int compare(int a, int b) {
        return a - b;
    }

    public static int divide(int a, int b) throws DivideByNull {
        if (b == 0) throw new DivideByNull("Знаменатель не должен быть равен 0!");
        return a / b;
    }

    public static int[] sort(int[] array) {

        // реализация сортировки

        return array;
    }
}
