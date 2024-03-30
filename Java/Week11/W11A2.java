/*
 * Write the JDBC codes needed to create a Connection interface using the
 * DriverManager class and the variable DB_URL.
 * Check whether the connection is successful using 'isAlive(timeout)' method to
 * generate the output, which is either 'true' or 'false'.
 * 
 * Note the following points carefully:
 * 
 * § Name the connection object as conn only.
 * 
 * § Use timeout value as 1.
 */

import java.sql.*;
import java.util.Scanner;

class W11_P2 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");

            // from here
            conn = DriverManager.getConnection(DB_URL);

            boolean isAlive = conn.isValid(1);
            System.out.println(isAlive);
            // till here

            conn.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}