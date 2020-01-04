package com.mock.preparation.threads;

public class Getname extends Thread {
    Getname(String threadname, ThreadGroup ab) {
        super(ab, threadname);
        start();
    }

    public void run() {
        for (int i = 0; i < 1; i++) {
            try {
                System.out.println("Threading started: " + i);
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Exception Countered");
            }
            // System.out.println(Thread.currentThread() + " Finished threading");
        }
    }
}

class Examples {
    public static void main(String[] args) throws InterruptedException, SecurityException {
        ThreadGroup tg = new ThreadGroup("PARENT GROUP");
        ThreadGroup tg_child = new ThreadGroup("CHILD GROUP");
        Getname gn = new Getname("Hello", tg);
        System.out.println("Hello");
        Getname gn1 = new Getname("World", tg);
        System.out.println("World");

        gn.getName();
        gn1.getName();
        /*
        block  until other thread is finished
         */
        gn1.join();
        gn.join();
        /*
        Destroy child thread
         */
        tg_child.destroy();
        System.out.println("child thread destroyed");
        /*
        destroy parent thread
         */
        tg.destroy();
        System.out.println("parent thread destroyed");

    }
}