/*
 * Write a Program to find the sum of all even numbers from 1 to N where the value of N is taken as input.
 * [For example when N is 10 then the sum is 2+4+6+8+10 = 30]
 *
 * Sample Test Cases:
 * Input	Output
 * Test Case 1:
 * 25
 * Sum = 156
 * Test Case 2:
 * 30
 * Sum = 240
 * Test Case 3:
 * 10
 * Sum = 30
 * Test Case 4:
 * 15
 * Sum = 56
 *
 * Sample solutions (Provided by instructor):
 */

#include <stdio.h>  
void main() {
    int N, sum = 0;
    scanf("%d", &N); /* The value of N is taken from the test cases */

    /* Complete the program. Please use the printf statement given below to
    exactly match your output with the test cases.

    printf("Sum = %d", sum);

    */
    int i;
    for (i = 1; i <= N; i++) {
        if (i % 2 == 0)
            sum = sum + i;
    }
    printf("Sum = %d", sum);
}