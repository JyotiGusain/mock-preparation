package com.mock.preparation.inputoutput;


import java.io.*;

public class CustomizedSerialization2 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AccountCustomizedSerialization2 acs = new AccountCustomizedSerialization2();
        System.out.println(acs.name + " " + acs.pwd + " " + acs.pinnumber); //After Serialization--> Welcome Java 12345

        FileOutputStream fos = new FileOutputStream("inputoutput");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(acs);


        FileInputStream fis = new FileInputStream("inputoutput");
        ObjectInputStream ois = new ObjectInputStream(fis);
        AccountCustomizedSerialization2 acs2 = (AccountCustomizedSerialization2) ois.readObject();
        System.out.println(acs2.name + " " + acs2.pwd + " " + acs2.pinnumber); //AfterDeserialization--> Welcome null 0


    }
}
