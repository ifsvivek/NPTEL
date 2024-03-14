/*
Write a program to find the factorial of a given number using while loop.
Sample Test Cases
Input	Output
Test Case 1
11
The Factorial of 11 is : 39916800
Test Case 2
7
The Factorial of 7 is : 5040
Test Case 3
5
The Factorial of 5 is : 120
Test Case 4
10
The Factorial of 10 is : 3628800

The due date for submitting this assignment has passed.
As per our records you have not submitted this assignment.
Sample solutions (Provided by instructor)
*/

#include<stdio.h>
void main() {
    int n;
    long int fact;  /* n is the number whose factorial we have to find and fact is the factorial */
    scanf("%d", &n);  /* The value of n is taken from test cases */

    /* complete the program. Use the printf statements in the format mentioned below
    to match your output exactly with output test cases

    printf("The Factorial of %d is : %ld",n,fact);

    You can declare any other variables if required */
    int i = 1;
    fact = 1;
    while (i <= n) {
        fact *= i;
        i++;
    }
    printf("The Factorial of %d is : %ld", n, fact);
}