package ru.itis.inf400.lab11.model;

import java.util.Random;

public class Ant extends Player {
    public Ant() {}

    public Ant(int positionX, int positionY) {
        super("Ant", positionX, positionY);
    }

    public void move() {
        Random random = new Random();
        int direction = random.nextInt(4);

        switch (direction) {
            case 0:
                positionY -= (positionY > 0) ? 1 : 0;
                break;
            case 1:
                positionX += (positionX < fieldWidth - 1) ? 1 : 0;
                break;
            case 2:
                positionY += (positionY < fieldHeight - 1) ? 1 : 0;
                break;
            case 3:
                positionX -= (positionX > 0) ? 1 : 0;
                break;
        }
    }
}
