/*
Write a C Program to print the array elements in reverse order (Not reverse sorted order. Just the last element will become first element, second last element will become second element and so on)
Here the size of the array, ‘n’ and the array elements is accepted from the test case data. The last part i.e. printing the array is also written.
 You have to complete the program so that it prints in the reverse order.

Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
5
10
20
30
40
50
 50\n
40\n
30\n
20\n
10
50\n
40\n
30\n
20\n
10\n
Passed
Test Case 2
6
41
42
43
44
45
46
 46\n
45\n
44\n
43\n
42\n
41
46\n
45\n
44\n
43\n
42\n
41\n
Passed

Sample solutions (Provided by instructor)
*/
#include<stdio.h>

int main() {
    int arr[20], i, n;

    scanf("%d", &n); /* Accepts the number of elements in the array */

    for (i = 0; i < n; i++)
        scanf("%d", &arr[i]); /*Accepts the elements of the array */
    int j, temp;
    j = i - 1;   // last Element of the array
    i = 0;       // first element of the array

    while (i < j) {
        temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
        i++;
        j--;
    }
    for (i = 0; i < n; i++) {
        printf("%d\n", arr[i]); // For printing the array elements 
    }

    return (0);
}