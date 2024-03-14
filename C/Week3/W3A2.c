/*
  Write a C program to check if a given Number is zero or Positive or Negative Using if...else statement.
  [Week 3 programming assignments will not be considered for final evaluation]

  Sample Test Cases
  Input	Output
  Test Case 1
  6.45
  Positive number.
  Test Case 2
  0
  The number is 0.
  Test Case 3
  14.05
  Positive number.
  Test Case 4
  -50
  Negative number.

  The due date for submitting this assignment has passed.
  As per our records you have not submitted this assignment.
  Sample solutions (Provided by instructor)
 */

#include <stdio.h>

int main() {
    double number;
    scanf("%lf", &number);

    if (number <= 0.0) {
        if (number == 0.0)
            printf("The number is 0.");
        else
            printf("Negative number.");
    } else
        printf("Positive number.");
}