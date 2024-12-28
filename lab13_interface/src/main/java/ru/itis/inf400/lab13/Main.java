package ru.itis.inf400.lab13;

public class Main {
    public static void main(String[] args) {

        // Создаем массив из объектов, реализующих интерфейс IMove
        IMove[] players = {new Ant(), new Turtle(), new Dog()};

        for (IMove player : players) {
            player.move();
        }

    }
}
