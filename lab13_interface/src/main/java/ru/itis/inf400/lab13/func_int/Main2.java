package ru.itis.inf400.lab13.func_int;

public class Main2{

    public static void main(String[] args) {
        Apple[] apples = {new Apple(120, "Голд"),
                            new Apple(110, "Семеринка")};

        Apple comparator = new Apple();
        ArrayUtils.sort(apples, apples[0]);
    }
}
