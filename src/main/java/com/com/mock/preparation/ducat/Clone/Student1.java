package com.mock.preparation.ducat.Clone;

/*
Example of clone() method (Object cloning)

 Rahul
 23
 */
public class Student1 implements Cloneable {
    int RollNo;
    String name;

    Student1(int RollNo, String name) {
        this.name = name;
        this.RollNo = RollNo;
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        Student1 student1 = new Student1(23, "Rahul");
        Student1 student11 = (Student1) student1.clone();
        //System.out.println(" "+student1.name);
        System.out.println((" " + student11.name));
        System.out.println(" " + student1.RollNo);
        //System.out.println(" "+student11.RollNo);
    }

    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
