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

    public Game(){}

    public Game(int fieldWidth, int fieldHeight,int zoneStartX, int zoneStartY, int zoneEndX, int zoneEndY) {
        this.zoneStartX = zoneStartX;
        this.zoneStartY = zoneStartY;
        this.zoneEndX = zoneEndX;
        this.zoneEndY = zoneEndY;
        Player.setFieldSize(fieldWidth,fieldHeight);
        Random random = new Random();
        Ant ant = new Ant(random.nextInt(fieldWidth),random.nextInt(fieldHeight));


    }

    public


}
