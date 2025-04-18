package model;

public class Point {
    private float x;
    private float y;

    public Point() {}

    public Point(float argx, float argy) {
        x = argx;
        y = argy;
    }

    public void move(float deltaX, float deltaY) {
        x += deltaX;
        y += deltaY;
    }

    public void setX(float argx) {
        x = argx;
    }

    public void setY(float argy) {
        y = argy;
    }

    public float getX() {
        return x;
    }

    public float gety() {
        return y;
    }

    public int compare(Point point2) {
        return (int)(x - point2.x);
    }
}