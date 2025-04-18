public class ProgramTestarray {
    public static void main(String[] args) {

        int a[];

        a = new int[5];

        int[] b = new int[] {1,2,3,4,5,6,7};

        int[] c = {1,2,3,4,5,6,7};

        int[][] d = {
                {1,2,3},
                {4,5},
                {7,8,9}
        };

        for (int i = 0; i < d.length; ++i) {
            for (int j = 0; j < d[i].length; j++) {
                System.out.print(d[i][j] + " ");
            }
            System.out.println();
        }
/*
        for (int i = 0; i < c.length; ++i) {
            System.out.println(c[i]);
        }
*/
        
        // Рассмотрим целое число int как последовательность из 4 байт, т.е. 32 бит
        // (будем нумеровать их справа - налево от 0)
        // Задача хранить в одном целом числе 3 компоненты цвета:
        // красная - R, зеленая - G, синяя - B
        // каждая значением от 0 до 255 (т.е. умещается в 1 байт)
        // 1-е 8 бит справа отдадим под синий
        // следующие от 8 до 15 отдадим под зеленый
        // седующие от 16 до 23 под красный
        // 
        
        int color = 0xFF0F15;
        
        int componentR = (color & 0xFF0000) >> 16;
        int componentG = (color & 0x00FF00) >> 8;
        int componentB = color & 0x0000FF;

        System.out.printf("r = %2X\n", componentR);
        System.out.printf("g = %02X\n", componentG);
        System.out.printf("b = %2X\n", componentB);

    }
}