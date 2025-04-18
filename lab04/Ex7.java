public class Ex7 {
    public static void main(String[] args) {
        
        int[] a = {1, 2};
        int[] b = {3, 4};
        int[] c = new int[a.length + b.length];
        int num = 0;
        for (int i = 0; i < a.length; ++i) {
            c[num] += a[i];
            ++num;
        }
        for (int i = 0; i < b.length; ++i) {
            c[num] += b[i];
            ++num;
        }
        for (int i = 0; i < c.length; ++i) {
            System.out.print(c[i] + " ");
        }
    }
}