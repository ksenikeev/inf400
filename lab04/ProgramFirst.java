public class ProgramFirst {
    public static void main (String[] args) {
        double a[] = {1.5, 1, 3.4, 8.32, 9.0};
        double max = a[0];
        for (int i = 1; i < a.length; i++) {
            if (max < a[i]) {
                max = a[i];
            }
        }
        System.out.println(max);
    }
}