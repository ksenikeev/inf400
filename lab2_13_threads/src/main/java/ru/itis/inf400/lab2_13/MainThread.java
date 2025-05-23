package ru.itis.inf400.lab2_13;

public class MainThread {
    public static void main(String[] args) {

/*
        Thread thread = new Task();
        thread.start();
*/

        new Task("task 1").start();
        new Task("task 2").start();
        new Task("task 3").start();
        new Task("task 4").start();
        new Task("task 5").start();
        new Task("task 6").start();
        new Task("task 7").start();

    }
}

class Task extends Thread {

    private String taskName;
    public Task(String taskName) {
        this.taskName = taskName;
    }

    public void run() {
        System.out.println("task " + taskName + " from " + this.getId());
    }
}

