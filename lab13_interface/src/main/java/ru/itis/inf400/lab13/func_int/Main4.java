package ru.itis.inf400.lab13.func_int;

public class Main4 {

    public static void main(String[] args) {
        Apple[] apples = {new Apple(120, "Голд"),
                new Apple(110, "Семеринка")};

        // Создание экземпляра анонимного класса
        ICompareObject comparator = new ICompareObject() {
            @Override
            public int compare(Object var1, Object var2) {
                return ((Apple)var1).getPrice() - ((Apple)var1).getPrice();
            }
        };

        ArrayUtils.sort(apples, comparator);
    }

}
