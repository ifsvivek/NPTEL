// Print a given matrix in spiral form. Follow the naming convention as given in the main method of the suffix code.

package Java.Week10;

import java.util.*;

public class W10_P2 {
    // from here
    public static void spiral_method(int[][] spiral, int rows, int cols) {
        int i, startRow = 0, startCol = 0;
        while (startRow < rows && startCol < cols) {
            for (i = startCol; i < cols; ++i) {
                System.out.print(spiral[startRow][i] + " ");
            }
            startRow++;
            for (i = startRow; i < rows; ++i) {
                System.out.print(spiral[i][cols - 1] + " ");
            }
            cols--;
            if (startRow < rows) {
                for (i = cols - 1; i >= startCol; --i) {
                    System.out.print(spiral[rows - 1][i] + " ");
                }
                rows--;
            }
            if (startCol < cols) {
                for (i = rows - 1; i >= startRow; --i) {
                    System.out.print(spiral[i][startCol] + " ");
                }
                startCol++;
            }
        }
    }
    // till here

    public static void main(String args[]) {
        int i, j;
        Scanner s = new Scanner(System.in);
        int dimension = s.nextInt();

        int[][] spiral = new int[dimension][dimension];
        for (i = 0; i < dimension; i++) {
            // loop for columns
            for (j = 0; j < dimension; j++) {
                // reads the matrix elements
                spiral[i][j] = s.nextInt();
            }
        }
        spiral_method(spiral, dimension, dimension);
    }
}