package com.mock.preparation.AutoboxingUnboxing;

/*
Custom Wrapper class
 */
public class CustomWraperClass {
    private int i;

    CustomWraperClass() {

    }

    CustomWraperClass(int i) {
        this.i = i;
    }

    public int getI() {
        return i;
    }

    public void setI(int i) {
        this.i = i;
    }

    @Override
    public String toString() {
        return Integer.toString(100000);
    }
}
//Test the wrapper class

class TestCustomWrapperClass {
    public static void main(String[] args) {
        CustomWraperClass customWraperClass = new CustomWraperClass();
        System.out.println(customWraperClass);

    }
}
