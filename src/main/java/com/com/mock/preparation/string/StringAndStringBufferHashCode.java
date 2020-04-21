package com.mock.preparation.string;

/*
String Hash Code
Welcome
-1397214398
Welcome java
270400
StringBuffer HashCode
Welcome
1450495309
Welcome Java
1450495309
 */
public class StringAndStringBufferHashCode {
    public static void main(String[] args) {
        System.out.println("String Hash Code");
        String s = "Welcome";
        System.out.println(s);
        System.out.println(s.hashCode());
        s = s + " java";
        System.out.println(s);
        System.out.println(s.hashCode());


        System.out.println("StringBuffer HashCode");
        StringBuffer stringBuffer = new StringBuffer("Welcome");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.hashCode());
        stringBuffer = stringBuffer.append(" Java");
        System.out.println(stringBuffer);
        System.out.println(stringBuffer.hashCode());

    }
}
