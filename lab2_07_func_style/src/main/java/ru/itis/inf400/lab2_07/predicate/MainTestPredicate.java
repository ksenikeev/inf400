package ru.itis.inf400.lab2_07.predicate;

public class MainTestPredicate {

    public static void main(String[] args) {
        Set400<Integer> set = new Set400Impl<>();

        set.add(1);
        set.add(0);
        set.add(-1);
        set.add(-3);
        set.add(3);
        set.add(4);
        set.add(-5);

        Set400<Integer> filteredSet = set.filter(a -> a > 0);

        filteredSet.forEach(System.out::println);

    }
}
