public class ProgramPackedColor {
    public static void main(String[] args) {

        String RESET = "\u001b[0m";
        String RGB = "\u001b[38;2;R;G;Bm"; // R 0..255  G 0..255  B 0..255

        String RED   = "\u001b[38;2;255;0;0m";
        String GREEN = "\u001b[38;2;0;255;0m";
        String BLUE  = "\u001b[38;2;0;0;255m";
        String RECTANGLE = "\u2588";

        for (int i = 0; i < 8; ++i) {
            System.out.print("  0");
        }

        System.out.print(RED);
        for (int i = 0; i < 8; ++i) {
            System.out.print("  " + RECTANGLE);
        }

        System.out.print(GREEN);
        for (int i = 0; i < 8; ++i) {
            System.out.print("  " + RECTANGLE);
        }

        System.out.print(BLUE);
        for (int i = 0; i < 8; ++i) {
            System.out.print("  " + RECTANGLE);
        }

        System.out.println();
        for (int i = 31; i >= 0; --i) {
            System.out.printf("%3d",i);
        }

        System.out.print(RESET);
        System.out.println();
    }
}