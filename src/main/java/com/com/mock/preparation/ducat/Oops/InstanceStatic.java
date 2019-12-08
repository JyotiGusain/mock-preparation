package com.mock.preparation.ducat.Oops;

public class InstanceStatic {
    String name;
    int salary;

    void get(String s1,int s2)
    {
        name=s1;
        salary=s2;
    }
    void show()
    {
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args)
    {
        InstanceStatic e= new InstanceStatic();
        e.get("Jyoti",200000);
        InstanceStatic e1= new InstanceStatic();
        e1.get("Tanishq",3000000);
        e.show();
        e1.show();
    }
}
