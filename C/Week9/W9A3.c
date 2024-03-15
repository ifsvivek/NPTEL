/*
Write a C program to search a given number from a sorted 1D array and display the position at which it is found using binary search algorithm. The index location starts from 1.
Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
6
1
2
3
4
5
6
2
 2 found at location 2.
2 found at location 2.\n
Passed
Test Case 2
7
40
50
60
70
80
90
100
100
 100 found at location 7.
100 found at location 7.\n
Passed

Sample solutions (Provided by instructor)
*/

#include <stdio.h>
int main() {
    int c, n, search,
        array[100];
    scanf("%d", &n); //number of elements in the array

    for (c = 0; c < n; c++)
        scanf("%d", &array[c]);

    scanf("%d", &search); //The element to search is read from test case.

    /* Use the printf statements as below:
     printf("%d found at location %d.", search, variable_name);
     printf("Not found! %d isn't present in the list.", search);
    */
    int first, last, middle;
    first = 0;
    last = n - 1;
    middle = (first + last) / 2;

    while (first <= last) {
        if (array[middle] < search)
            first = middle + 1;
        else if (array[middle] == search) {
            printf("%d found at location %d.", search, middle + 1);
            break;
        } else
            last = middle - 1;

        middle = (first + last) / 2;
    }
    if (first > last)
        printf("Not found! %d isn't present in the list.", search);

    return 0;
}