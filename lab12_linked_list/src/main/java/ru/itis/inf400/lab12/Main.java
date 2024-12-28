package ru.itis.inf400.lab12;

public class Main {

    public static void main(String[] args) {

        Node first = new Node(5);

        Node second = new Node(7);

        first.next = second;

        // Згачение 2-го элемента
        System.out.println(first.next.value);

        Node third = new Node(11);

        second.next = third;

        // Згачение 3-го элемента
        System.out.println(first.next.next.value);

        System.out.println(findLast(first).value);

        add(15, first);

        System.out.println(findLast(first).value);

    }

    public static Node findLast(Node first) {
        Node e = first;
        while (e.next != null) {
            e = e.next;
        }
        return e;
    }

    public static void add(int value, Node first) {
        Node node = new Node(value);
        Node last = findLast(first);
        last.next = node;

    }


}
