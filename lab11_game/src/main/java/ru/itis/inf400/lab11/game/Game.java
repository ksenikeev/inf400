package ru.itis.inf400.lab11.game;

import ru.itis.inf400.lab11.model.Ant;
import ru.itis.inf400.lab11.model.Player;

import java.util.Random;

public class Game {
    private int zoneStartX;
    private int zoneStartY;
    private int zoneEndX;
    private int zoneEndY;
    private Player winner;
    private Player[] players;
    private int steps = 0;

    public Game(){}

    public Game(int fieldWidth, int fieldHeight,int zoneStartX, int zoneStartY, int zoneEndX, int zoneEndY) {
        this.zoneStartX = zoneStartX;
        this.zoneStartY = zoneStartY;
        this.zoneEndX = zoneEndX;
        this.zoneEndY = zoneEndY;
        Player.setFieldSize(fieldWidth,fieldHeight);
        Random random = new Random();
        Ant ant = new Ant(random.nextInt(fieldWidth),random.nextInt(fieldHeight));
        players = new Player[] {ant};

    }

    public void start() {
        steps = 1;
        while (true) {
            for (Player player: players) {
                player.move();
                if (zoneStartX <= player.getPositionX() &&
                        player.getPositionX() <= zoneEndX &&
                        zoneStartY <= player.getPositionY() &&
                        player.getPositionY() <= zoneEndY) {
                    winner = player;
                    return;
                }
            }

            steps++;
        }
    }

    public Player getWinner() {
        return winner;
    }

    public int getSteps() {
        return steps;
    }


}
