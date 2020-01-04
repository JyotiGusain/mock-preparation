package com.mock.preparation.collection;

/*
User-defined class objects in Java ArrayList


name: Tanishq
age: 12
rollno: 1

name: Tashvi
age: 13
rollno: 2

name: Eshvi
age: 14
rollno: 3

name: Kaira
age: 13
rollno: 4

name: Tilak
age: 13
rollno: 2

 */

import java.util.ArrayList;
import java.util.Iterator;

class Student {
    int age;
    String name;
    int rollno;

    Student(int age, String name, int rollno) {
        this.age = age;
        this.name = name;
        this.rollno = rollno;
    }
}

public class ArrayListDemo2 {
    public static void main(String[] args) {
        Student s1 = new Student(12, "Tanishq", 1);
        Student s2 = new Student(13, "Tashvi", 2);
        Student s3 = new Student(14, "Eshvi", 3);
        Student s4 = new Student(13, "Kaira", 4);
        Student s5 = new Student(13, "Tilak", 2);

        ArrayList al = new ArrayList();
        al.add(s1);
        al.add(s2);
        al.add(s3);
        al.add(s4);
        al.add(s5);

        Iterator itr = al.iterator();
        while (itr.hasNext()) {
            Student st = (Student) itr.next();

            System.out.println(" \nname: " + st.name + " \nage: " + st.age + " \nrollno: " + st.rollno);
        }


    }
}

