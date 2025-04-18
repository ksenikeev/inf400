public class TaskTen {
    public static void main (String[] args) {
        int[] a = {1, 45, 2, 6} ;
        int b = 15;
        boolean ind = false;
        for (int i = 0; i < a.length; ++i) {
            if (a[i] == b) {
                ind = true;
                break;
            } 
        }
        if (ind) {
            System.out.println( "Есть");
        } else {
            System.out.println( "Нет");
        }
    }
}