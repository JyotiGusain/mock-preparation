package com.mock.preparation.ducat.staticvariable;

public class Emp1 {
    static String cname = "TCS";
    String name;
    int salary;

    static int add(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        Emp1 e3 = new Emp1();
        e3.get("ABC", 100000);
        e3.show();
        System.out.println(cname);
        System.out.println(Emp.cname);
        int z = Emp1.add(12, 23);
        System.out.println(z);
        z = add(12, 23);
        System.out.println(z);
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

class Demo {
    public static void main(String[] args) {
        int z = Emp1.add(12, 45);
        System.out.println(z);
        System.out.println(Emp.cname);
    }

}