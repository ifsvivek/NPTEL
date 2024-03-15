/*
Write a C program to search a given element from a 1D array and display the position at which it is found by using linear search function. The index location starts from 1.

Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
4
45
65
85
25
95
 95 is not present in the array.
95 is not present in the array.
Passed
Test Case 2
5
6
9
5
4
7
6
 6 is present at location 1.
6 is present at location 1.
Passed


Sample solutions (Provided by instructor)
*/
#include <stdio.h>
int linear_search(int[], int, int);
int main() {
    int array[100], search, c, n, position;
    /* search - element to search, c - counter, n - number of elements in array,
    position - The position in which the element is first found in the list. */

    scanf("%d", &n); // Number of elements in the array is read from the test case data

    for (c = 0; c < n; c++)
        scanf("%d", &array[c]); //Elements of array is read from the test data

    scanf("%d", &search);  //Element to search is read from the test case data

    /* Use the following in the printf statement to print the output
    printf("%d is not present in the array.", search);
    printf("%d is present at location %d.", search, position+1); //As array[0] has the position 1
    */
    position = linear_search(array, n, search);

    if (position == -1)
        printf("%d is not present in the array.", search);
    else
        printf("%d is present at location %d.", search, position + 1);
    return 0;
}

int linear_search(int a[], int n, int find) {
    int c;
    for (c = 0;c < n; c++) {
        if (a[c] == find)
            return c;
    }
    return -1;
}