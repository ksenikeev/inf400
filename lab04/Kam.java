public class Kam {
    public static void main(String[] args) {
        double [] numbers = {2.14, 8.97, 6,54, 9.23, 2,14};
        double min = numbers[0];
        for (int i = 1; i < numbers.length; ++i) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println(min);
    }
}