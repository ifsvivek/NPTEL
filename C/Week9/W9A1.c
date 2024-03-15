/*
 * Write a program to print all the locations at which a particular element
 * (taken as input) is found in a list and also print the total number of
 * times it occurs in the list. The location starts from 1.
 *
 * For example if there are 4 elements in the array
 * 5
 * 6
 * 5
 * 7
 * If the element to search is 5 then the output will be
 * 5 is present at location 1
 * 5 is present at location 3
 * 5 is present 2 times in the array.
 *
 * Private Test cases used for evaluation:
 * Input:
 * Test Case 1
 * 7
 * 30
 * 50
 * 90
 * 30
 * 70
 * 30
 * 30
 * 30
 * Expected Output:
 * 30 is present at location 1.
 * 30 is present at location 4.
 * 30 is present at location 6.
 * 30 is present at location 7.
 * 30 is present 4 times in the array.
 * Actual Output:
 * 30 is present at location 1.
 * 30 is present at location 4.
 * 30 is present at location 6.
 * 30 is present at location 7.
 * 30 is present 4 times in the array.
 * Status: Passed
 *
 * Test Case 2
 * Input:
 * 4
 * 50
 * 60
 * 20
 * 10
 * 80
 * Expected Output:
 * 80 is not present in the array.
 * Actual Output:
 * 80 is not present in the array.
 * Status: Passed


Sample solutions (Provided by instructor)
*/

#include <stdio.h>
int main() {
    int array[100], search, n, count = 0;
    //"search" is the key element to search and 'n' is the total number of element of the array
    // "count" is to store total number of elements

    scanf("%d", &n); //Number of elements is taken from test case

    int c;
    for (c = 0; c < n; c++)
        scanf("%d", &array[c]);

    scanf("%d", &search); // The element to search is taken from test case

    /* Use the printf statements as below:
    "%d is present at location %d.\n"  for each locations
    "%d is not present in the array.\n" if the element is not found in the list
    "%d is present %d times in the array.\n"
    */
    for (c = 0; c < n; c++) {
        if (array[c] == search) {
            printf("%d is present at location %d.\n", search, c + 1);
            count++;
        }
    }
    if (count == 0)
        printf("%d is not present in the array.\n", search);
    else
        printf("%d is present %d times in the array.\n", search, count);

    return 0;
}