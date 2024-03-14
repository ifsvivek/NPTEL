/*
 * Write a code to find the Determinant of the 2D matrix.
 */

import java.util.*;

public class W08_P5 {
    // from here
    public static int determinantOfMatrix(int[][] matrix, int n) {
        int det = 0;
        if (n == 1) {
            return matrix[0][0];
        } else if (n == 2) {
            return matrix[0][0] * matrix[1][1] - matrix[0][1] * matrix[1][0];
        } else {
            for (int p = 0; p < n; p++) {
                int[][] subMatrix = new int[n - 1][n - 1];
                for (int i = 1; i < n; i++) {
                    for (int j = 0; j < n; j++) {
                        if (j < p) {
                            subMatrix[i - 1][j] = matrix[i][j];
                        } else if (j > p) {
                            subMatrix[i - 1][j - 1] = matrix[i][j];
                        }
                    }
                }
                int sign = (p % 2 == 0) ? 1 : -1;
                det += sign * matrix[0][p] * determinantOfMatrix(subMatrix, n - 1);
            }
            return det;
        }
    }

    // till here
    public static void main(String args[]) {
        int array[][] = new int[5][5];
        int i, j;
        Scanner s = new Scanner(System.in);

        int dimension = s.nextInt();

        for (i = 0; i < dimension; i++) {
            // loop for columns
            for (j = 0; j < dimension; j++) {
                // reads the matrix elements
                array[i][j] = s.nextInt();
            }
        }
        System.out.printf("Determinant of the matrix is : %d",
                determinantOfMatrix(array, dimension));
        s.close();
    }
}