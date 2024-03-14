/*
Write a C Program to delete duplicate elements from an array of integers.
Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
6
50
6
7
7
2
7
 50\n
6\n
7\n
2
50\n
6\n
7\n
2\n
Passed
Test Case 2
7
2
4
2
6
4
2
4
 2\n
4\n
6
2\n
4\n
6\n
Passed


Sample solutions (Provided by instructor)
*/
#include<stdio.h>

int main() {
    int array[50], i, size;

    scanf("%d", &size); /*Accepts the size of array from test case data */

    for (i = 0; i < size; i++)
        scanf("%d", &array[i]); /* Read the array elements from the test case data */
    int j, k;
    for (i = 0; i < size; i++) {
        for (j = i + 1; j < size;) {
            if (array[j] == array[i]) {
                for (k = j; k < size; k++) {
                    array[k] = array[k + 1];
                }
                size--;
            } else
                j++;
        }
    }
    for (i = 0; i < size; i++) {
        printf("%d\n", array[i]);
    }

}