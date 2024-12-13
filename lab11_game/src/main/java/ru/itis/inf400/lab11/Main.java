package ru.itis.inf400.lab11;

import ru.itis.inf400.lab11.game.Game;
import ru.itis.inf400.lab11.model.Player;

public class Main {
    public static void main(String[] args) {
        Game game = new Game(1000, 1000,
                450, 450, 500, 500);
        game.start();
        Player winner = game.getWinner();
        int steps = game.getSteps();
        System.out.println(winner + " " + steps);
    }
}
