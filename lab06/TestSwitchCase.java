import java.util.Scanner;

public class TestSwitchCase {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        boolean isStop = false;
        while (!isStop) {
            System.out.println("Введите направление хода (U, D, L, R), E - выход:");
            String direction = scanner.next();
            isStop = directionHandlerYield(direction);
        }

    }

    public static boolean directionHandler(String direction) {
        switch (direction) {
            case "U" :
            case "u" :
                System.out.println("Идем наверх");break;
            case "D" :
            case "d" :
                System.out.println("Идем вниз");break;
            case "L" :
            case "l" :
                System.out.println("Идем налево");break;
            case "R" :
            case "r" :
                System.out.println("Идем направо");break;
            case "E" :
            case "e" :
                System.out.println("Выходим");
                return true;
            default:
                System.out.println("Такого действия НЕТ!");
        }

        return false;
    }

    public static boolean directionHandlerYield(String direction) {
        return switch (direction) {
            case "U" :
            case "u" : {
                System.out.println("Идем наверх");
                yield false;
            }
            case "D" :
            case "d" : {
                System.out.println("Идем вниз");
                yield false;
            }
            case "L" :
            case "l" : {
                System.out.println("Идем налево");
                yield false;
            }
            case "R" :
            case "r" : {
                System.out.println("Идем направо");
                yield false;
            }
            case "E" :
            case "e" : {
                System.out.println("Выходим");
                yield true;
            }
            default: {
                System.out.println("Такого действия НЕТ!");
                yield false;
            }
        };
    }

}