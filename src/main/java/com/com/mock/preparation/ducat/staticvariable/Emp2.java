package com.mock.preparation.ducat.staticvariable;

public class Emp2 {
    static String cname = "TCS";
    String name;
    int salary;

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Emp2 e = new Emp2();
        e.get("XYZ", 10000);
        e.show();
        Emp2 e1 = e;
        System.out.println(e1);
        e1.name = "ABC";
        System.out.println(e1.name);

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
