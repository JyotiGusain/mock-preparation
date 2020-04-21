package com.mock.preparation.singleton;

public class SingletonClass {

    private static SingletonClass instance = new SingletonClass();

    /*
    private constructor so that no one from outside can create object of SingletonClass
     */
    private SingletonClass() {

    }

    public static SingletonClass getInstance() {
        return instance;
    }
}
