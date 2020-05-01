package com.mock.preparation.AutoboxingUnboxing;

/*
Autoboxing is converting the primitive data types to the corresponding wrapper class.
Unboxing is converting the corresponding wrapper class to the primitive data types.

--Printing object values--
Integer Object: 10
Long Object: 20
Character Object: a

--Printing Primitive values--
Interger Primitive values: 10
Character primitive value: a



 */
public class AutoboxingUnboxing {
    public static void main(String[] args) {
        int a = 10;
        long b = 20;
        char c = 'a';
        float f = 23.23f;
        double d = 23.345;

        //Converting the primitive data type to corresponding wrapper class

        Integer intobj = a;
        Long longobj = b;
        Character charobj = c;

        System.out.println("--Printing object values--");

        System.out.println("Integer Object: " + intobj);
        System.out.println("Long Object: " + longobj);
        System.out.println("Character Object: " + charobj);

        //Converting the corresponding wrapper class to primitive data type
        Integer intvalue = intobj;
        Character charactervalue = charobj;

        System.out.println();
        System.out.println("--Printing Primitive values--");

        System.out.println("Interger Primitive values: " + intvalue);
        System.out.println("Character primitive value: " + charactervalue);

    }

}
