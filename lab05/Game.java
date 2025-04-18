public class Game {

    private static int[][] maze = {
        {1,1,1,1,0,1,1},
        {1,1,1,1,0,1,1},
        {1,1,1,1,0,1,1},
        {1,1,1,1,0,1,1},
        {1,1,1,1,0,1,1},
        {1,1,1,1,0,1,1},
        {1,1,1,1,0,1,1},
    };


    private static char[][] gameState = {
        {'.','.','.','.','X','.','.'},
        {'.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.'},
        {'.','.','.','.','.','.','.'}
    };



    private static int stepCounter = 0;

    public static void main(String[] args) {
        printRules();
        startGame();
        printResult();
    }

    private static void startGame() {
        printGameField();

        while (false) {

        }
    }

    private static void printGameField() {
        for (int i = 0; i < gameState.length; ++i) {
            for (int j = 0; j < gameState[0].length; ++j) {
                System.out.print(gameState[i][j] + " ");
            }
            System.out.println();
        }
    }

    private static void printRules() {
        System.out.println("Игра лабиринт ... ");
    }

    private static void printResult() {
        System.out.printf("Вы прошли лабиринт за %d шагов\n", stepCounter);
    }
}