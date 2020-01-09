package com.mock.preparation.inputoutput;

import java.io.*;

public class AccountCustSerialization implements Serializable {
    String username = "Tanishq";
    transient String password = "Bisht";

    private void writeObject(ObjectOutputStream os) throws Exception {
        os.defaultWriteObject();
        String epassword = 123 + password;
        os.writeObject(epassword);
    }

    private void readObject(ObjectInputStream is) throws Exception {
        is.defaultReadObject();
        String epassword = (String) is.readObject();
        password = epassword.substring(3);
    }

}

class CustomizedSerialization {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        AccountCustSerialization a1 = new AccountCustSerialization();
        //System.out.println(a1.username+" "+a1.password);

        FileOutputStream fos = new FileOutputStream("inputoutput");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(a1);

        FileInputStream fis = new FileInputStream("inputoutput");
        ObjectInputStream ois = new ObjectInputStream(fis);
        AccountCustSerialization a2 = (AccountCustSerialization) ois.readObject();
        System.out.println(a2.username + " " + a2.password);
    }
}