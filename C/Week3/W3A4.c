/*
 * Write a C Program to find the Largest Number (integer) among Three Numbers (integers) 
 * using IF and Logical && operator.
 *
 * Sample Test Cases:
 * Input	Output
 * Test Case 1:
 * -9 -4 -20
 * -4 is the largest number.
 * Test Case 2:
 * 45 34 67
 * 67 is the largest number.
 * Test Case 3:
 * 80 -5 3
 * 80 is the largest number.
 *
 * Sample solutions (Provided by instructor):
 */
#include <stdio.h>

int main() {
    int n1, n2, n3;

    scanf("%d %d %d", &n1, &n2, &n3); /*Three numbers are accepted from the test case */

    /* Complete the code in the box provided below. Use printf statement as provided below:
    printf("%d is the largest number.", n1);
    It may be n1, n2 or n3.
    */
    if (n1 >= n2 && n1 >= n3)
        printf("%d is the largest number.", n1);

    if (n2 >= n1 && n2 >= n3)
        printf("%d is the largest number.", n2);

    if (n3 >= n1 && n3 >= n2)
        printf("%d is the largest number.", n3);
}