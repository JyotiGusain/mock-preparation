package com.mock.preparation.immutable;

public final class Addressoftheschool {
    private String place;
    private String area;
    private int pincode;

    public Addressoftheschool(String place, String area, int pincode) {
        this.place = place;
        this.area = area;
        this.pincode = pincode;
    }

    public String getPlace() {
        return place;
    }

    public void setPlace(String place) {
        this.place = place;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public int getPincode() {
        return pincode;
    }

    public void setPincode(int pincode) {
        this.pincode = pincode;
    }
}

