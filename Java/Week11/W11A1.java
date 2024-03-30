/*
 * The following code is missing some information needed to run the code.
 * Add whatever is missing and make the code runnable.
 * (Ignore the statements ~~~THERE IS SOME INVISIBLE CODE HERE~~~)
 */


// from here
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.SQLException;
// till here

public class W11_P1 {
    public static void main(String args[]) {
        try {
            Connection conn = null;
            Statement stmt = null;
            String DB_URL = "jdbc:sqlite:/tempfs/db";
            System.setProperty("org.sqlite.tmpdir", "/tempfs");
            ~~~THERE IS SOME INVISIBLE CODE HERE~~~
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}