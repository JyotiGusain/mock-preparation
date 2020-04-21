package com.mock.preparation.inputoutput;
/*
Default constructor
Tanishq 12345 0
 */
import java.io.*;

public class ExternalizationDemo implements Externalizable {
    String name;
    int id;
    int salary;

    public ExternalizationDemo() {
        System.out.println("Default constructor");
    }

    public ExternalizationDemo(String name, int id, int salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        ExternalizationDemo ed1 = new ExternalizationDemo("Tanishq", 121, 12345);

        FileOutputStream fos = new FileOutputStream("inputfile");
        ObjectOutputStream oos = new ObjectOutputStream(fos);
        oos.writeObject(ed1);

        FileInputStream fis = new FileInputStream("inputfile");
        ObjectInputStream ois = new ObjectInputStream(fis);
        ExternalizationDemo ed2 = (ExternalizationDemo) ois.readObject();
        System.out.println(ed2.name + " " + ed2.salary + " " + ed2.id);
    }

    @Override
    public void writeExternal(ObjectOutput out) throws IOException {
        out.writeObject(name);
        out.writeObject(salary);
    }

    @Override
    public void readExternal(ObjectInput in) throws IOException, ClassNotFoundException {
        this.name = (String) in.readObject();
        // int id = (int) in.readObject();
        this.salary = (int) in.readObject();
    }
}


