import java.util.Scanner;

public class TestConsoleInput {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //String inputVar = scanner.nextLine();
        int inputVar = scanner.nextInt();

        System.out.println(inputVar);
    }
}