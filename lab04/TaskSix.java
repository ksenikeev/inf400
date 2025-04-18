public class TaskSix {
    public static void main (String[] args) {
        int odd = 0;
        int even = 0;
        int[] array = new int[] {1, 2, 3, 4, 5};
        for (int i = 0; i < array.length; ++i) {
            if (i % 2 == 0) {
                odd += array[i];
            } else {
                even += array[i];
            }
            
        }
        System.out.println(odd - even);
        
    }
}