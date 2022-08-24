package ca.teluq;

import java.sql.*;

public class App 
{
    public static void main( String[] args ) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:1234/teluq", "root", "root");
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }    
    }
}
