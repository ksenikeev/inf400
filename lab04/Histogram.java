public class Histogram {
    public static void main(String[] args) {
        int[] arr = {2, 1, 0};
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        
        for (int i = 0; i < max; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (arr[j] > i) {
                    System.out.print("X");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}