/*
 * Complete the code segment to create a new table named ‘STUDENTS’ in SQL
 * database using the following information.
 * 
 * Column
 * 
 * UID
 * 
 * Name
 * 
 * Roll
 * 
 * Age
 * 
 * Type
 * 
 * Integer
 * 
 * Varchar (45)
 * 
 * Varchar (12)
 * 
 * Integer
 * 
 * 
 */

import java.sql.*;
import java.lang.*;

public class W11_P4 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();

            // from here
            String sql = "CREATE TABLE STUDENTS " +
                         "(UID INT, " +
                         " Name VARCHAR(45), " + 
                         " Roll VARCHAR(12), " + 
                         " Age INT);"; 
            stmt.executeUpdate(sql);
            // till here

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}