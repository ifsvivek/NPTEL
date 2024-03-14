/*
Write a C Program to Find the Smallest Number among Three Numbers (integer values) using Nested IF-Else statement.
Sample Test Cases
Input	Output
Test Case 1
90 -9 -80
-80 is the smallest number.
Test Case 2
100 200 0
0 is the smallest number.
Test Case 3
80 40 90
40 is the smallest number.
Test Case 4
77 88 -99
-99 is the smallest number.

The due date for submitting this assignment has passed.
As per our records you have not submitted this assignment.
Sample solutions (Provided by instructor)
*/

#include <stdio.h>
int main() {
    int n1, n2, n3;
    scanf("%d %d %d", &n1, &n2, &n3); /* where three number are read from the test cases and are stored in the variable n1, n2 and n3 */

    /* Complete the program to get the desired output */
    /* Only use the printf statement given below to exactly match your output
    with the output cases. Change the variable n1 as required.

    printf("%d is the smallest number.", n1);    //Copy and paste this printf statement wherever required.

    */
    if (n1 < n2) {
        if (n1 < n3)
            printf("%d is the smallest number.", n1);
        else
            printf("%d is the smallest number.", n3);
    } else {
        if (n2 < n3)
            printf("%d is the smallest number.", n2);
        else
            printf("%d is the smallest number.", n3);
    }
}