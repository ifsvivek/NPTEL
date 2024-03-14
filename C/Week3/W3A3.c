/*
Write a C program to check whether a given number (integer) is Even or Odd.
[This program does not carry any marks.]

Sample Test Cases
Input	Output
Test Case 1	
116
116 is even.
Test Case 2	
-25
-25 is odd.
Test Case 3	
24
24 is even.
Test Case 4	
51
51 is odd.

The due date for submitting this assignment has passed.
As per our records you have not submitted this assignment.
Sample solutions (Provided by instructor)
*/

#include <stdio.h>

int main() {
    int number;
    scanf("%d", &number); /*An integer number is taken from the test case */

    /* Write the rest of the program in the box provided below. As the output
    should exactly match with the output provided in the test cases so use exactly the
    following printf statement wherever and whichever is applicable. */

    if (number % 2 == 0)
        printf("%d is even.", number);
    else
        printf("%d is odd.", number);
}