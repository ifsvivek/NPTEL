/*
Write a C program to reverse an array by swapping the elements and without using any new array.

Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
7
8
9
10
6
4
7
11
 Reversed array elements are:\n
11\n
7\n
4\n
6\n
10\n
9\n
8
Reversed array elements are:\n
11\n
7\n
4\n
6\n
10\n
9\n
8\n
Passed


Sample solutions (Provided by instructor)
*/
#include <stdio.h>
int main() {
    int array[100], n, c;
    scanf("%d", &n); // n is number of elements in the array.
    for (c = 0; c < n; c++) {
        scanf("%d", &array[c]);
    }
    int temp, end;
    end = n - 1;
    for (c = 0; c < n / 2; c++) {
        temp = array[c];
        array[c] = array[end];
        array[end] = temp;

        end--;
    }
    printf("Reversed array elements are:\n");

    for (c = 0; c < n; c++) {
        printf("%d\n", array[c]);
    }
    return 0;
}