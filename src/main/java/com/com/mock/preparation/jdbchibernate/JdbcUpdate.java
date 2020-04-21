package com.mock.preparation.jdbchibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcUpdate {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/./esha;IFEXISTS=TRUE", "sa", "sa");
        System.out.println("Connection Done Succesfully");
        Statement stmt = con.createStatement();

        //Update the salary in Customer table
        stmt.executeUpdate("UPDATE CUSTOMER SET SALARY= 15000 WHERE ID =7");

        //Delete the salary in Customer table
        stmt.executeUpdate("DELETE FROM CUSTOMER WHERE ID= 1");

        //Insert the salary in Customer table
        stmt.executeUpdate("INSERT  into CUSTOMER(ID,NAME,AGE,ADDRESS,SALARY)" + " VALUES ('8','Virendra','35','Glasgow','25000')");

        //Delete the salary in Customer table
        stmt.executeUpdate("DELETE FROM CUSTOMER WHERE ID= 1");

        ResultSet re = stmt.executeQuery("Select * from CUSTOMER");
        while (re.next()) {
            System.out.println(re.getString(1));
            System.out.println(re.getString(2));
            System.out.println(re.getString(3));
            System.out.println(re.getString(4));
            System.out.println(re.getString(5));

        }
        re.close();
    }
}



