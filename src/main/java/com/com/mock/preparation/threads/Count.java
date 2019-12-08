package com.mock.preparation.threads;


public class Count implements Runnable {
    Thread mythread;

    Count() {
        mythread = new Thread(this, "my runnable thread");
        System.out.println("Process of threading start" + mythread);
        mythread.start();
    }

    public void run() {
        try {
            for (int i = 0; i < 10; i++) {
                System.out.println("Counting the numbers: " + i);
                Thread.sleep(1500);
            }
        } catch (InterruptedException e) {
            System.out.println("Thread is going to be end");
        }
        System.out.println("Ends of mythread");
    }
}

class Runnableimplements {
    public static void main(String[] args) {
        Count c = new Count();
        {
            try {
                while (c.mythread.isAlive()) {
                    System.out.println("Thread will be running till the child is alive ");
                    Thread.sleep(2000);
                }
            } catch (InterruptedException e) {
                System.out.println("The process is over");
            }
            System.out.println("End of the process");

        }

    }

}