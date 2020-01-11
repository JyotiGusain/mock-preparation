package com.mock.preparation.inputoutput;
/*
When child class implemets and also in parent,child constructor called.

Animal Constructor called
Dog Constructor called
10 20
Animal Constructor called
10 0
 */


import java.io.*;

class Animal1 {
    int i = 10;

    Animal1() {
        System.out.println("Animal Constructor called ");
    }
}

class Dog1 extends Animal1 implements Serializable {
    transient int j = 20;

    Dog1() {
        System.out.println("Dog Constructor called ");
    }
}

public class ChildImplentsSerializable1 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Dog1 d1 = new Dog1();
        System.out.println(d1.i + " " + d1.j);

        FileOutputStream fos = new FileOutputStream("inputoutput");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(d1);

        FileInputStream fis = new FileInputStream("inputoutput");
        ObjectInputStream ois = new ObjectInputStream(fis);
        Dog1 d2 = (Dog1) ois.readObject();
        System.out.println(d2.i + " " + d2.j);


    }
}
