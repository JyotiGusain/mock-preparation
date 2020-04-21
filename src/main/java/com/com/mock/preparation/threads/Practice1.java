package com.mock.preparation.threads;

public class Practice1 implements Runnable {

    public static void main(String[] args) {
        Practice1 p = new Practice1();
        Thread t1 = new Thread(p, "t1");
        Thread t2 = new Thread(p, "t2");

        t1.start();
        t2.start();

        try {
            t1.join();
            t2.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main Thread Started");
    }

    @Override
    public void run() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(Thread.currentThread().getName() + " run method");
    }
}