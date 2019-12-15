package com.mock.preparation.threads;


public class ThreadViaInheritance extends Thread {
    ThreadViaInheritance(String s) {
        super(s);
    }

    public void run() {
        for (int i = 0; i <= 5; i++) {
            System.out.println(getName());
        }
    }
}

class ThreadViainheritance1 extends Thread {
    ThreadViainheritance1(String s) {
        super(s);
    }

    public void run() {
        for (int i = 0; i <= 10; i++) {
            System.out.println(getName());
        }
    }


}

class ThreadViainheritance2 extends Thread {
    ThreadViainheritance2(String s) {
        super(s);
    }

    public void run() {
        for (int i = 0; i <= 15; i++) {
            System.out.println(getName());
        }
    }
}

class MainThread {
    public static void main(String[] args) {
        ThreadViaInheritance t1 = new ThreadViaInheritance("Thread1");
        ThreadViainheritance1 t2 = new ThreadViainheritance1("Thread2");
        ThreadViainheritance2 t3 = new ThreadViainheritance2("Thread3");

        t1.start();
        t2.start();
        t3.start();

        for (int i = 0; i <= 10; i++) {
            System.out.println(Thread.currentThread().getName());
        }
    }
}