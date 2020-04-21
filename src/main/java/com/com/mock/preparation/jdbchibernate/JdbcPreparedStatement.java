package com.mock.preparation.jdbchibernate;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class JdbcPreparedStatement {
    public static void main(String[] args) throws Exception {
        Class.forName("org.h2.Driver");
        Connection con = DriverManager.getConnection("jdbc:h2:tcp://localhost/./esha;IFEXISTS=TRUE", "sa", "sa");
        /*PreparedStatement stmt= con.prepareStatement("Insert into CUSTOMER  values(?,?,?,?,?)");
        stmt.setInt(1,1);
        stmt.setString(2,"Prithvi");
        stmt.setInt(3,35);
        stmt.setString(4,"Mumbai");
        stmt.setInt(5,250000);

        stmt.executeUpdate();
         System.out.println("Records Inserted");*/

        PreparedStatement stmt1 = con.prepareStatement("Delete from CUSTOMER where id= ?");
        stmt1.setInt(1, 8);
       /* stmt1.setString(2,"Prithvi");
        stmt1.setInt(3,35);
        stmt1.setString(4,"Mumbai");
        stmt1.setInt(5,250000);*/

        stmt1.executeUpdate();

        System.out.println("Records Deleted");
        con.close();
    }
}
