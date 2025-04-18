public class ProgramColoredOutput {
    public static void main(String[] args) {

        String RESET = "\u001b[0m";
        String RGB = "\u001b[38;2;R;G;Bm"; // R 0..255  G 0..255  B 0..255

        String RED = "\u001b[38;2;255;0;0m";
        String RECTANGLE = "\u2588";

        System.out.print(RED);
        System.out.println("Hello!");
        System.out.println(RECTANGLE);

        System.out.print(RESET);
    }
}