package com.mock.preparation.threads;

public class ThreadViaInheritance1 extends Thread {
    ThreadViaInheritance1(String s) {
        super(s);
        //start();
    }

    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName());
            //System.out.println("ABC");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(getName() + "hello");
        }
    }
}

class ThreadViaInheritance2 extends Thread {
    ThreadViaInheritance2(String s) {
        super(s);
        //start();
    }

    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName());
            //System.out.println("ABC");
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(getName() + "HELLO");
        }
    }
}

class ThreadViaInheritance3 extends Thread {
    ThreadViaInheritance3(String s) {
        super(s);
        //start();
    }

    public void run() {
        for (int i = 0; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName());
            //System.out.println("ABC");
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(getName() + "Rock");
        }
    }
}

class MainThread1 {
    public static void main(String[] args) {
        ThreadViaInheritance1 e1 = new ThreadViaInheritance1("ABC");
        ThreadViaInheritance2 e2 = new ThreadViaInheritance2("PQR");
        ThreadViaInheritance3 e3 = new ThreadViaInheritance3("XYZ");

        e1.start();
        e2.start();
        e3.start();

        for (int i = 0; i <= 2; i++) {
            System.out.println(Thread.currentThread().getName());
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
                System.out.println(e);
            }
            System.out.println(Thread.currentThread().getName() + "ROCK ON!!!!!!");
        }

    }
}