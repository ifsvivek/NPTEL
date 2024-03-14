/*
Write a C Program to calculate the area (floating point number with two decimal places) of a Circle given its radius (integer value).
The value of Pi is 3.14.

[Marks for Week 3 Programming assignments will not be evaluated finally. This is for users to get familiar with programming in google course builder platform]

Sample Test Cases:
Input	Output
Test Case 1:
50
Area of a circle = 7850.00

Test Case 2:
7
Area of a circle = 153.86

Test Case 3:
42
Area of a circle = 5538.96

The due date for submitting this assignment has passed.
As per our records, you have not submitted this assignment.

Sample solution (Provided by instructor):
*/

#include <stdio.h>
#define PI 3.14

void main() {
    int radius;
    float area;

    /* Enter the radius of a circle */
    scanf("%d", &radius);

    /* Calculate the area of the circle */
    area = PI * radius * radius;

    printf("Area of a circle = %5.2f", area);
}