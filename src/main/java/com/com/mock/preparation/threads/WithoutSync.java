package com.mock.preparation.threads;

/*
Without and With Syncronization

Without Synchronization
0 A B 1 C 2 D E 3 F 4 G H I J

With Synchronization
0 1 2 3 4 A B C D E F G H I J

 */
class Display1 {
    public synchronized void displayn() {
        for (int i = 0; i < 5; i++) {
            System.out.print(i + " ");
            try {
                Thread.sleep(1500);
            } catch (Exception e) {
                System.out.println("Exception occured");
            }
        }
    }

    public synchronized void displayc() {
        for (int i = 65; i < 75; i++) {
            System.out.print((char) i + " ");
            try {
                Thread.sleep(1000);
            } catch (Exception e) {
                System.out.println("Exception Occured");
            }
        }
    }

}

class ThreadDisplay2 extends Thread {
    Display1 display;

    ThreadDisplay2(Display1 display) {
        this.display = display;
    }

    public void run() {
        display.displayn();
    }
}

class ThreadDisplay3 extends Thread {
    Display1 display1;

    ThreadDisplay3(Display1 display1) {
        this.display1 = display1;
    }

    public void run() {
        display1.displayc();
    }
}


public class WithoutSync {
    public static void main(String[] args) {
        Display1 d1 = new Display1();
        ThreadDisplay2 td = new ThreadDisplay2(d1);
        ThreadDisplay3 td1 = new ThreadDisplay3(d1);
        td.start();
        td1.start();
    }
}
