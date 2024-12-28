package ru.itis.inf400.lab13.compare;

public class Main {
    public static void main(String[] args) {

        Person person1 = new Person("PRS1", 23, "M", 90);
        Person person2 = new Person("PRS2", 43, "M", 90);

        int comp = person1.compare(person2);

        if (comp > 0)
            System.out.println(person1);
        else if (comp < 0)
            System.out.println(person2);
        else
            System.out.println("одинаковы");

    }
}
