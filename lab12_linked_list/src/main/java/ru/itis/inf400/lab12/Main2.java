package ru.itis.inf400.lab12;
// Двусвязный (двунаправленный) список
public class Main2 {

    public static void main(String[] args) {

        Node2 first = new Node2(5);

        Node2 second = new Node2(7);
        first.next = second;
        second.prev = first;

        Node2 third = new Node2(11);
        second.next = third;
        third.prev = second;

        Node2 last = third;

        last = add(15, last);

        printReverse(last);

    }

    public static Node2 findLast(Node2 first) {
        Node2 e = first;
        while (e.next != null) {
            e = e.next;
        }
        return e;
    }

    public static Node2 add(int value, Node2 last) {
        Node2 node = new Node2(value);
        node.prev = last;
        last.next = node;
        return node;
    }

    public static void printReverse(Node2 last) {
        Node2 node = last;
        while (node != null) {
            System.out.println(node.value);
            node = node.prev;
        }
    }


}
