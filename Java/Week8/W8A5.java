/*
 * Write a code to find the Determinant of the 2D matrix.
 */

import java.util.*;

public class W08_P5 {
    // from here
    static int determinantOfMatrix(int mat[][], int n) {
        int num1, num2, det = 1, index,
                total = 1; // Initialize result

        // temporary array for storing row
        int[] temp = new int[n + 1];

        // loop for traversing the diagonal elements
        for (int i = 0; i < n; i++) {
            index = i; // initialize the index

            // finding the index which has non zero value
            while (mat[index][i] == 0 && index < n) {
                index++;
            }
            if (index == n) // if there is non zero element
            {
                // the determinant of matrix as zero
                continue;
            }
            if (index != i) {
                // loop for swapping the diagonal element row
                // and index row
                for (int j = 0; j < n; j++) {
                    swap(mat, index, j, i, j);
                }
                // determinant sign changes when we shift
                // rows go through determinant properties
                det = (int) (det * Math.pow(-1, index - i));
            }

            // storing the values of diagonal row elements
            for (int j = 0; j < n; j++) {
                temp[j] = mat[i][j];
            }

            // traversing every row below the diagonal
            // element
            for (int j = i + 1; j < n; j++) {
                num1 = temp[i]; // value of diagonal element
                num2 = mat[j][i]; // value of next row element

                // traversing every column of row
                // and multiplying to every row
                for (int k = 0; k < n; k++) {
                    // multiplying to make the diagonal
                    // element and next row element equal
                    mat[j][k] = (num1 * mat[j][k])
                            - (num2 * temp[k]);
                }
                total = total * num1; // Det(kA)=kDet(A);
            }
        }

        // multiplying the diagonal elements to get
        // determinant
        for (int i = 0; i < n; i++) {
            det = det * mat[i][i];
        }
        return (det / total);
    }

    static int[][] swap(int[][] arr, int i1, int j1, int i2,
            int j2) {
        int temp = arr[i1][j1];
        arr[i1][j1] = arr[i2][j2];
        arr[i2][j2] = temp;
        return arr;
    }

    public static void main(String args[]) {
        int array[][] = new int[5][5];
        int i, j;
        // double sum = 0, square = 0, result = 0;
        Scanner s = new Scanner(System.in);

        int dimension = s.nextInt();

        for (i = 0; i < dimension; i++) {
            // loop for columns
            for (j = 0; j < dimension; j++) {
                // reads the matrix elements
                array[i][j] = s.nextInt();
                // prints space
                // System.out.print(" ");
            }
        }
        System.out.printf("Determinant of the matrix is : %d",
                determinantOfMatrix(array, dimension));
    }
}