package com.mock.preparation.ducat.staticvariable;

public class Emp {
    static String cname = "TCS";
    String name;
    int salary;

    public static void main(String[] args) {
        Emp e = new Emp();
        System.out.println(e.name);
        System.out.println(e.salary);
    }

    void get(String s1, int s2) {
        name = s1;
        salary = s2;
    }

    void show() {
        System.out.println(name);
        System.out.println(salary);
        System.out.println(cname);
    }

}
