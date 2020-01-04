package com.mock.preparation.threads;

public class CountThread extends Thread {
    CountThread() {
        super("MY first counter thread");
        System.out.println("Welcome to the thread count " + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Print the count " + i);
                Thread.sleep(2000);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is interrupted");
            System.out.println("Thread stop running");
        }
    }
}

class extendingthread {
    public static void main(String[] args) {
        CountThread ch = new CountThread();
        {
            try {
                while (ch.isAlive()) {
                    System.out.println("Main thread will be alive till the child class is alive");
                    Thread.sleep(1000);
                }
            } catch (InterruptedException e) {
                System.out.println("Thread got interrupted");
            }
            System.out.println("Thread has completed its process");
        }
    }
}
