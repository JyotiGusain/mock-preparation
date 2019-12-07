package com.mock.preparation.threads;

public class VoidDestroyMethod extends Thread {
    VoidDestroyMethod(String threadname, ThreadGroup a) {
        super(a, threadname);
        start();
    }

    public void run() {
        for (int i = 0; i < 2; i++) {
            try {
                Thread.sleep(1000);
                System.out.println("Thread is executing :" + i);
            } catch (InterruptedException e) {
                System.out.println("Execution Interrupted");
            }
        }

    }

}

class Destroymethod {
    public static void main(String[] args) throws InterruptedException, SecurityException {
        ThreadGroup tgg = new ThreadGroup("a");
        ThreadGroup tgg_child = new ThreadGroup(tgg, "child");
        VoidDestroyMethod vm1 = new VoidDestroyMethod("ABC", tgg);
        System.out.println("ABC");
        VoidDestroyMethod vm2 = new VoidDestroyMethod("PQR", tgg);
        System.out.println("PQR");
        /*
        block  until other thread is finished
         */
        vm1.join();
        vm2.join();
        /*
        destroy child thread
         */
        tgg_child.destroy();
        System.out.println(" child thread destroyed ");
        /*
        destroyed parent thread
         */
        tgg.destroy();
        System.out.println(" parent thread destroyed");
    }
}
