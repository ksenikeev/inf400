package ru.itis.inf400.lab12;

public class MainDynamic {

    public static void main(String[] args) {

        Node first = new Node(5);
        add(7, first);
        add(11, first);
        add(15, first);
        add(21, first);
        add(25, first);

        //System.out.println(findLast(first).value);

        printRevers(first);

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

    public static void printRevers(Node first) {
        Node lastPrinted = findLast(first);

        do {
            System.out.println(lastPrinted.value);

            Node node = first;
            while (node.next != lastPrinted) {
                node = node.next;
            }
            lastPrinted = node;
        } while (lastPrinted != first);
        System.out.println(first.value);
    }

}
