class TaskFive {
    public static void main(String[] args) {
        long[] a = {4, 6, 7 ,9, 12};
        long res = 1;
        for (int i = 0; i < a.length; i++) {
            res *= a[i];
        }
        System.out.println(res);
    }
}