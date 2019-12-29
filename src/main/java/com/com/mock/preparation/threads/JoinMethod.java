package com.mock.preparation.threads;

/*
If a thread wants to wait until the completion of other thread then we should go for join() method


o/p:Child Thread
    Child Thread
    Child Thread
    Main thread

 */


class MyThread2 extends Thread {
    public void run() {
        for (int i = 0; i < 3; i++) {
            System.out.println("Child Thread");
        }
    }
}

public class JoinMethod {
    public static void main(String[] args) throws InterruptedException {
        MyThread2 t = new MyThread2();
        t.start();
        for (int i = 0; i < 3; i++)
            t.join(1000);
        {
            System.out.println("Main thread");

        }
    }
}
