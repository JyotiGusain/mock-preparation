package com.mock.preparation.ducat.Oops;

public class InstanceStatic1
{
    static String Company="TCS";
    String name;
    int salary;
    void get(String s1,int s2,String s3)
    {
        name=s1;
        salary=s2;
        Company=s3;
    }
    void show()
    {
        System.out.println(Company);
        System.out.println(name);
        System.out.println(salary);
    }

    public static void main(String[] args)
    {
        InstanceStatic e= new InstanceStatic();
        e.get("Virendra",1000000);
        e.show();
    }
}
