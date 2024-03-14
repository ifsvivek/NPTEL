/*
The length of three sides are taken as input. Write a C program to find whether a triangle can be formed or not. If not display “This Triangle is NOT possible.” If the triangle can be formed then check whether the triangle formed is equilateral, isosceles, scalene or a right-angled triangle. (If it is a right-angled triangle then only print Right-angle triangle do not print it as Scalene Triangle).
Sample Test Cases
Input	Output
Test Case 1
10 4 6
Triangle is not possible
Test Case 2
7 6 8
Scalene Triangle
Test Case 3
9 9 9
Equilateral Triangle
Test Case 4
5 12 13
Right-angle Triangle

The due date for submitting this assignment has passed.
As per our records you have not submitted this assignment.
Sample solutions (Provided by instructor)
*/

#include<stdio.h>
int main() {
    int a, b, c;
    scanf("%d %d %d", &a, &b, &c); /*The length of three sides are entered from the test cases */

    /* Complete the program. Copy and paste from the printf statements mentioned below wherever required for printing the outputs

    printf("Triangle is not possible");
    printf("Right-angle Triangle");
    printf("Isosceles Triangle");
    printf("Equilateral Triangle");
    printf("Scalene Triangle");

    */
    if (a < (b + c) && b < (a + c) && c < (a + b)) {
        if (a == b && a == c && b == c)
            printf("Equilateral Triangle");
        else if (a == b || a == c || b == c)
            printf("Isosceles Triangle");
        else
            if ((a * a) == (b * b) + (c * c) || (b * b) == (a * a) + (c * c) || (c * c) == (a * a) + (b * b))
                printf("Right-angle Triangle");
            else if (a != b && a != c && b != c)
                printf("Scalene Triangle");
    } else
        printf("Triangle is not possible");
}