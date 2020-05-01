package com.mock.preparation.Callbyvalue;
/*
In case of Call By Value the original value will not change
Before Change: 100
After Change: 100
 */
public class CallByValue {
    int data = 100;

    public static void main(String[] args) {
        CallByValue callByValue = new CallByValue();
        System.out.println("Before Change: " + callByValue.data);
        callByValue.change(callByValue);
        System.out.println("After Change: " + callByValue.data);
    }

    void change(CallByValue callByValue) {
        data = data + 10;
    }
}
