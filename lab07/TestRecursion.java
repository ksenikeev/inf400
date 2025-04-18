public class TestRecursion {
    /*
        S(n) = 1 + 2 + 3 + ... n

        S(n) = S(n - 1) + n
     */

    public static void main(String[] args) {
        int n = 10;

        System.out.println(sum(n));
    }

    public static int sum(int n) {
        if (n == 1) {
            return 1;
        } else {
            return sum(n - 1) + n;
        }
    }
}