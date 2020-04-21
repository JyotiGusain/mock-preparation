package com.mock.preparation.immutable;

public class Address implements Cloneable {

    private String fistLineAddress;

    private int pinCode;

    private String city;

    private String state;

    public Address(String fistLineAddress, int pinCode, String city, String state) {
        this.fistLineAddress = fistLineAddress;
        this.pinCode = pinCode;
        this.city = city;
        this.state = state;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getFistLineAddress() {
        return fistLineAddress;
    }

    public void setFistLineAddress(String fistLineAddress) {
        this.fistLineAddress = fistLineAddress;
    }

    public int getPinCode() {
        return pinCode;
    }

    public void setPinCode(int pinCode) {
        this.pinCode = pinCode;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    @Override
    public Address clone() {
        Address address = new Address(this.fistLineAddress, this.pinCode, this.city, this.state);
        return address;
    }
}
