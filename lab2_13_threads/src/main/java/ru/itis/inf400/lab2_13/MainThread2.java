package ru.itis.inf400.lab2_13;

public class MainThread2 {
    public static void main(String[] args) {

        int countProc = Runtime.getRuntime().availableProcessors();
        System.out.println(countProc);

        new Thread(new Task2("task 1")).start();
        new Thread(new Task2("task 2")).start();
        new Thread(new Task2("task 3")).start();
        new Thread(new Task2("task 4")).start();
        new Thread(new Task2("task 5")).start();
        new Thread(new Task2("task 6")).start();
        new Thread(new Task2("task 7")).start();
    }
}

class Task2 implements Runnable {

    private String taskName;
    public Task2(String taskName) {
        this.taskName = taskName;
    }

    @Override
    public void run() {
        System.out.println("task " + taskName + " from " + Thread.currentThread().getId());
    }
}

