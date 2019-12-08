package com.mock.preparation.threads;

public class CountThreading extends Thread {
    CountThreading() {
        super(" Count the Threading ");
        System.out.println("Process of counting started" + this);
        start();
    }

    public void run() {
        try {
            for (int i = 0; i <= 10; i++)
                System.out.println("Thread started to run " + i);
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Threading started");
        }
    }
}

class threadextendsthread {
    public static void main(String[] args) {
        CountThreading ct = new CountThreading();
        while (ct.isAlive()) ;
        System.out.println("Threading counter finished ");


    }
}
