package com.mock.preparation.threads;

/*
Each thread have a priority. Priorities are represented by a number between 1 and 10.
thread schedular schedules the threads according to their priority

setPriority(2)
Main Thread
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread


setPriority(10);
Child Thread
Child Thread
Child Thread
Child Thread
Child Thread
Main Thread

 */
class Mythread extends Thread {
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println("Child Thread");
        }
    }
}

class ThreadPriority {
    public static void main(String[] args) {
        Mythread t = new Mythread();
        t.setPriority(8);
        // t.setPriority(2);
        t.start();
        System.out.println("Main Thread");

    }
}