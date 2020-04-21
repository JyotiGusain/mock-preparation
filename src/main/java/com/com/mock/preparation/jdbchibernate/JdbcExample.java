package com.mock.preparation.jdbchibernate;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class JdbcExample {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:tcp://localhost/./esha;IFEXISTS=TRUE", "sa", "sa");
        Statement c = conn.createStatement();
        ResultSet re = c.executeQuery("Select * from CUSTOMER");
        while (re.next()) {
            System.out.print(re.getString(1));
            System.out.println();
            System.out.println(re.getString(2));
            System.out.println(re.getString(3));
            System.out.println(re.getString(4));
            System.out.println(re.getString(5));
        }
    }
}
