package com.mock.preparation.immutable;

import java.util.Objects;

/*
this is immutable class.

 */
public final class Employee {
    private final int id;

    private final String fistName;

    private final String lastName;

    private final Address address;

    public Employee(int id, String fistName, String lastName, Address address) {
        this.id = id;
        this.fistName = fistName;
        this.lastName = lastName;
        this.address = address;
    }

    public int getId() {
        return id;
    }

    public String getFistName() {
        return fistName;
    }

    public String getLastName() {
        return lastName;
    }

    public Address getAddress() {
        return (Address) address.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id &&
                Objects.equals(fistName, employee.fistName) &&
                Objects.equals(lastName, employee.lastName) &&
                Objects.equals(address, employee.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fistName, lastName, address);
    }
}
