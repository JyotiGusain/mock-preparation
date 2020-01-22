package com.mock.preparation.inputoutput;
/*
During default serialization there may be a chance of loss of information due to transient keyword.
To recover this loss of information we should go for customized serialization.

Before Serialization--> Welcome Java 12345
Default Serialization  -->Welcome null 0
--------------------*----------------------
Customized Serialization --> Welcome Java 12345

Welcome Java 12345

 */

import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class AccountCustomizedSerialization2 implements Serializable {
    String name = "Welcome";
    transient String pwd = "Java";
    transient int pinnumber = 12345;


    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        String epwd = 123 + pwd;
        int epinno = 890678 + 12345;
        os.writeObject(epwd);
        os.writeObject(epinno);
    }

    private void readObject(ObjectInputStream is) throws Exception {
        is.defaultReadObject();
        String epwd = (String) is.readObject();
        int epinno = (Integer) is.readObject();
        pwd = epwd.substring(3);
        pinnumber = epinno - 890678;
    }


}

