package ru.itis.inf400.lab2_13;

public class PrintManyHello {

    public static void main(String[] args) {

        LockingObject lockingObject = new LockingObject();
        PrintHello printHello = new PrintHello(lockingObject);

        for (int i = 0; i < 10; ++i) {
            new Thread(new PrintHello(lockingObject)).start();
        }
    }

    static class PrintHello implements Runnable {
        LockingObject lockingObject;

        public PrintHello(LockingObject lockingObject) {
            this.lockingObject = lockingObject;
        }

        public void run() {
            String message = "Добро пожаловать в параллельную реальность!";
            synchronized (lockingObject) {
                for (int i = 0; i < message.length(); ++i)
                    System.out.print(message.charAt(i));
                System.out.println();
            }
        }
    }

    static class LockingObject {

    }
}
