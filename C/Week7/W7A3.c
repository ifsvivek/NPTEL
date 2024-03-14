/*
Write a C program to find subtraction of two matrices i.e. matrix_A - matrix_B=matrix_C.

 If the given martix are

 2 3 5     and  1 5 2    Then the output will be  1 -2 3

 4 5 6             2 3 4                                           2 2 2

 6 5 7             3 3 4                                           3 2 3

 The elements of the output matrix are separated by one blank space

Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
3
4
5
6
7
8
3
2
5
6
1
3
9
5
2
9
3
1
2
5
1
2
2
3
4
1
 3 -3 4 7 \n
1 -3 4 4 \n
-1 0 5 4
3 -3 4 7 \n
1 -3 4 4 \n
-1 0 5 4 \n
Passed


Sample solutions (Provided by instructor)
*/

#include <stdio.h>
int main() {
    int matrix_A[20][20], matrix_B[20][20], matrix_C[20][20];
    int i, j, row, col;
    scanf("%d", &row); //Accepts number of rows
    scanf("%d", &col); //Accepts number of columns 

    /* Elements of first matrix are accepted from test data */
    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            scanf("%d", &matrix_A[i][j]);
        }
    }

    /* Elements of second matrix are accepted from test data */

    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            scanf("%d", &matrix_B[i][j]);
        }
    }

    /* Complete the program to get the desired output. Use printf() statement as below
        printf("%d ", matrix_C[i][j]); You can declare your own variables if required.
    */
    /*
        Subtract both matrices and store the result in matrix C
      */
    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {

            matrix_C[i][j] = matrix_A[i][j] - matrix_B[i][j];
        }
    }

    for (i = 0; i < row; i++) {
        for (j = 0; j < col; j++) {
            printf("%d ", matrix_C[i][j]);
        }
        printf("\n");
    }

    return 0;
}