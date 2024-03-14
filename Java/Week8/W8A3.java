/*
 * Write a code to find the Trace of the 2D matrix.
 */

import java.util.*;

public class W08_P3 {
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);

        // reads number of rows from the user
        int row = s.nextInt();

        // reads number of columns from the user
        int column = s.nextInt();

        int array[][] = new int[row][column];
        int i, j;

        // Input 2D matrix using Scanner Class
        for (i = 0; i < row; i++) {
            // loop for columns
            for (j = 0; j < column; j++) {
                // reads the matrix elements
                array[i][j] = s.nextInt();
            }
        }

        // from here
        double trace = 0;
        for (i = 0; i < row; i++) {
            for (j = 0; j < column; j++) {
                if (i == j) {
                    trace += array[i][j];
                }
            }
        }
        System.out.print(trace);
        s.close();
        // till here
    }
}