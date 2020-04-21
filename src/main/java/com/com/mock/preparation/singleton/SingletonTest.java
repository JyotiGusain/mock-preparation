package com.mock.preparation.singleton;

public class SingletonTest {

    public static void main(String[] args) throws InterruptedException {
        System.out.println("Singleton demo class here");
        Employee employee = Employee.getInstance();

        Employee employee1 = Employee.getInstance();


        if (employee.equals(employee1)) {
            System.out.println("Employee 1 and 2 are same");
        } else {
            System.out.println("Both employee 1 & 2 are not same");
        }
    }

}

