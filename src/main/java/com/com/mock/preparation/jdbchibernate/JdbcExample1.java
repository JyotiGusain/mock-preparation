package com.mock.preparation.jdbchibernate;

import java.sql.*;

public class JdbcExample1 {


    private static final String SQL_QUERY = "Select * from Book";


    public static void main(String[] args) throws SQLException {
        Connection con = null;

        try {
            Class.forName("org.h2.Driver");

            //con = DriverManager.getConnection("http://192.168.43.11:8082");
            con = DriverManager.
                    getConnection("jdbc:h2:tcp://localhost/./esha;IFEXISTS=TRUE", "sa", "sa");
            System.out.println("Database connection created succesfully");
            Statement stmt = con.createStatement();
            System.out.println("About to execute sql query: " + SQL_QUERY);
            ResultSet rs = stmt.executeQuery(SQL_QUERY);
            System.out.println("Query executed successfully, Book details are:");
            System.out.println("id| Name | Author | Price");
            while (rs.next()) {
                System.out.println(rs.getInt(1) + " | " + rs.getString(2) + " | " + rs.getString(3) + " | " + rs.getInt(4));
            }

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } finally {
            if (con != null) {
                con.close();
            }
        }
    }

}
