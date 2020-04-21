package com.mock.preparation.collection.generics;

import java.util.ArrayList;
import java.util.List;

abstract class Employee {
    abstract void department();
}

class MechanicalDept extends Employee {

    @Override
    void department() {
        System.out.println("We are in Mechanical Department");
    }
}

class ComputerDept extends Employee {

    @Override
    void department() {
        System.out.println("We are in Computer Department");
    }
}

public class Wildcardsingenerics2 {
    public static void departments(List<? extends Employee> lists) {
        for (Employee e : lists)
            e.department();
    }

    public static void main(String[] args) {

        List<MechanicalDept> l1 = new ArrayList<MechanicalDept>();
        l1.add(new MechanicalDept());

        List<ComputerDept> l2 = new ArrayList<ComputerDept>();
        l2.add(new ComputerDept());

        departments(l1);
        departments(l2);
    }
}
