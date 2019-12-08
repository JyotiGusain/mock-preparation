package com.mock.preparation.threads;

public class ActiveGroupCount extends Thread {
    ActiveGroupCount(String threadname, ThreadGroup abc) {
        super(abc, threadname);
        start();
    }

    public void run() {
        for (int i = 0; i < 100; i++) {
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                System.out.println("Exception Counter");
            }
        }
        System.out.println(Thread.currentThread().getName() + "  finished execution  ");
    }
}

class ActiveGroupCount1 {
    public static void main(String[] args) throws InterruptedException {
        /*
        Creating thread group
         */
        ThreadGroup tg = new ThreadGroup("tg");
        ThreadGroup tg_child = new ThreadGroup(tg, "child");
        ActiveGroupCount acc = new ActiveGroupCount("HELLO", tg);
        System.out.println("Hello");
        ActiveGroupCount acc1 = new ActiveGroupCount("Welcome", tg);
        System.out.println("Welcome");
        /*
        Counting the number of threads
         */
        System.out.println("Active Group Count: " + tg.activeGroupCount());
    }
}
