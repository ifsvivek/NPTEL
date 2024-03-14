/*
Write a C program to find the sum of all elements of each row of a matrix.

   Example: For a matrix  4 5 6

                                        6 7 3

                                        1 2 3

  The output will be

  15

  16

   6

Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
3
2
4
4
5
5
6
6
 8\n
10\n
12
8\n
10\n
12\n
Passed
Test Case 2
3
4
1
-1
2
-2
5
-5
7
-7
8
-8
6
-6
 0\n
0\n
0
0\n
0\n
0\n
Passed


Sample solutions (Provided by instructor)
*/

#include <stdio.h>
int main() {
    int matrix[20][20];
    int i, j, r, c;

    scanf("%d", &r); //Accepts number of rows
    scanf("%d", &c); //Accepts number of columns 

    for (i = 0;i < r;i++) //Accepts the matrix elements from the test case data
    {
        for (j = 0;j < c;j++) {
            scanf("%d", &matrix[i][j]);
        }
    }
    /*Complete the code to print the sum of each rows. Use the printf() statement as
     printf("%d\n",sum); Where sum is the sum of a row.
    */
    int index = 1;
    int array[index];
    for (i = 0;i < r;i++) {
        int sum = 0;
        for (j = 0;j < c;j++) {
            sum = sum + matrix[i][j];
        }
        array[index - 1] = sum;
        index++;
    }
    for (i = 0;i < index - 1;i++) {
        printf("%d\n", array[i]);
    }
    return 0;
}