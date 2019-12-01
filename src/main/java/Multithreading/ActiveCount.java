package Multithreading;
/*
Counting number od active threads
 */

public class ActiveCount extends Thread {
    ActiveCount(String threadname, ThreadGroup tgob) {
        super(tgob, threadname);
        start();
    }

    public void run() {
        for (int i = 0; i < 10; i++)
            try {
                Thread.sleep(5);
            } catch (InterruptedException e) {
                System.out.println("End of the process");
            }


    }

}

class Countthread {
    public static void main(String[] args) {
        ThreadGroup gfg = new ThreadGroup("Parent thread count");
        ActiveCount acc1 = new ActiveCount("JAVA", gfg);
        System.out.println("Starting with JAVA");
        ActiveCount acc2 = new ActiveCount("C++", gfg);
        System.out.println("Starting with C++");
        ActiveCount acc3 = new ActiveCount("1", gfg);
        System.out.println("Starting with 1");

        /*
        chechking number of threads active
         */
        System.out.println("Counting number of threads : " + gfg.activeCount());
    }
}
