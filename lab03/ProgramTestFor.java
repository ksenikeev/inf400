public class ProgramTestFor {
    public static void main(String[] args) {

        int N = 10;

        for (int i = 0; i < N; ++i) {
            
            //System.out.println(i);
        }


        for (int i = 0, j = 0; i + j < N; ++i, j += 2) {

            System.out.printf(" i = %d, j = %d, i + j = %d\n", i, j, i + j);
        }
// 0, 1, 2, 3, 

    }
}