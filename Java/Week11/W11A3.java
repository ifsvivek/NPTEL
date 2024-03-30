/*
 * Due to some mistakes in the below code, the code is not compiled/executable.
 * 
 * Modify and debug the JDBC code to make it execute successfully.
 */

// from here
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class W11_P3 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            conn = DriverManager.getConnection(DB_URL);
            System.out.println(!conn.isClosed());
            // till here

            
            conn.close();
        } catch (Exception e) {

            System.out.println(e);
        }
    }
}