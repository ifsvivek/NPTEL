/*
 * Complete the code segment to rename an already created table named ‘STUDENTS’  into ‘GRADUATES’.
 */

import java.sql.*;
import java.lang.*;

public class W11_P5 {
    public static void main(String args[]) throws SQLException {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // Open a connection
            conn = DriverManager.getConnection(DB_URL);
            stmt = conn.createStatement();

            // from here
            String sql = "ALTER TABLE STUDENTS RENAME TO GRADUATES";
            stmt.executeUpdate(sql);
            // till here
            

        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
