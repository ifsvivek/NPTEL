/*
Write a C program to count total number of digits of an Integer number (N).
* Private Test cases used for evaluation	Input	Expected Output	                    Actual Output	                    Status
Test Case                                   145667 The number 145667 contains 6 digits. The number 145667 contains 6 digits. Passed
Test Case 2                                 87      The number 87 contains 2 digits.    The number 87 contains 2 digits.  Passed

Sample solutions (Provided by instructor)
*/
#include <stdio.h>
int main() {
    int N;
    scanf("%d", &N); /*The number is accepted from the test case data*/

    /* Complete the rest of the code. Please use the printf statements as below
    by just changing the variables used in your program

    printf("The number %d contains %d digits.",N,count);

    */
    int temp, count;
    count = 0;
    temp = N;
    while (temp > 0) {
        count++;
        temp /= 10;
    }
    printf("The number %d contains %d digits.", N, count);
}