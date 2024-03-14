/*
Write a C Program to find Largest Element of an Integer Array.
Here the number of elements in the array ‘n’ and the elements of the array is read from the test data.
Use the printf statement given below to print the largest element.

printf("Largest element = %d", largest);

Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
4
-400
-800
-700
-50
 Largest element = -50
Largest element = -50
Passed
Test Case 2
7
60
70
200
12
40
-90
60
 Largest element = 200
Largest element = 200
Passed

Sample solutions (Provided by instructor)
*/
#include <stdio.h>

int main() {
    int i, n, largest;
    int arr[100];

    scanf("%d", &n); /*Accepts total number of elements from the test data */

    for (i = 0; i < n; ++i) {
        scanf("%d", &arr[i]); /* Accepts the array element from test data */
    }
    largest = arr[0];
    for (i = 1; i < n; ++i) {
        if (largest < arr[i])
            largest = arr[i];
    }
    printf("Largest element = %d", largest);

    return 0;
}