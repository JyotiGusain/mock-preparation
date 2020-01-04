package com.mock.preparation.string;

public class StrinbBufferinsert {
    public static void main(String[] args) {
        /*StringBuffer sb= new StringBuffer("hello");
        sb.insert(2,"JAVA");
        System.out.println(sb);*/

        StringBuffer sb = new StringBuffer();
        //sb.replace(0,3,"XYZ");
        //System.out.println(sb);
        //sb.delete(2,3);
        //sb.reverse();
        //System.out.println(sb.capacity());
        /*sb.append("hello");
        System.out.println(sb.capacity());
        sb.append("java is a programming language");
        System.out.println(sb.capacity());
        sb.ensureCapacity(60);
        System.out.println(sb.capacity());
        sb.ensureCapacity(100);
        System.out.println(sb.capacity());*/

        sb.append("hello");
        System.out.println(sb.capacity());
        sb.ensureCapacity(10);
        //System.out.println(sb.capacity());
        sb.ensureCapacity(70);
        System.out.println(sb.capacity());
        sb.ensureCapacity(2);
        //System.out.println(sb.capacity());

    }
}
