package com.mock.preparation.singleton;

public class Employee {

    private static Employee employee = null;

    private Employee() {
        //no -args constructor
    }

    public static Employee getInstance() {
        if (employee != null) {
            return employee;
        }
        synchronized (Employee.class) {
            if (null == employee) {
                employee = new Employee();
            }
            return employee;
        }
    }

}
