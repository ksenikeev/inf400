import model.Point;

public class Main {

    public static void main(String[] args) {

        Point point1 = new Point();
        point1.setX(1);
        point1.setY(2);

        Point point2 = new Point(3,4);

        point1.move(3,3);

        System.out.println(point1.getX());
        System.out.println(point2.getX());
    }
}