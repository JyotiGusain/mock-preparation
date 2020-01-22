package com.mock.preparation.inputoutput;

/*
When child class implemets Serializable
888 999
10 999
 */

import java.io.*;

class Animal {
    transient int i = 10;
}

class Dog extends Animal implements Serializable {
    int j = 20;
}

public class ChildImplementsSerializable {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog d1 = new Dog();
        d1.i = 888;
        d1.j = 999;
        System.out.println(d1.i + " " + d1.j);

        FileOutputStream fos = new FileOutputStream("inputoutput");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("inputoutput");
        ObjectInputStream ois = new ObjectInputStream((fis));
        Dog d2 = (Dog) ois.readObject();
        System.out.println(d2.i + " " + d2.j);
    }

}
