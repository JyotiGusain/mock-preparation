package com.mock.preparation.threads;

class MyThread extends Thread {
    public void run() {
        System.out.println(Thread.currentThread().getName());
    }
}

public class GetandSetnameofathread {
    public static void main(String[] args) {
        MyThread t = new MyThread();
        t.start();
        System.out.println(Thread.currentThread().getName());
        Thread.currentThread().setName("ABC");
        System.out.println(Thread.currentThread().getName());
    }

}

