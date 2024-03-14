/*
Write a C program to check whether the given number(N) can be expressed as Power of Two (2) or not.
For example 8 can be expressed as 2^3.
Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
256
 256 is a number that can be expressed as power of 2.
256 is a number that can be expressed as power of 2.\n
Passed
Test Case 2
800
 800 cannot be expressed as power of 2.
800 cannot be expressed as power of 2.\n
Passed

Sample solutions (Provided by instructor)
*/
#include <stdio.h>
int main() {
    int N;
    scanf("%d", &N); /* The value of N is taken from the test case data */

    /* Complete the code.
    Use the printf statements as below
    printf("%d is a number that can be expressed as power of 2.",N);
    printf("%d cannot be expressed as power of 2.",N);
    */
    int temp, flag;
    temp = N;
    flag = 0;

    while (temp != 1) {
        if (temp % 2 != 0) {
            flag = 1;
            break;
        }
        temp = temp / 2;
    }

    if (flag == 0)
        printf("%d is a number that can be expressed as power of 2.", N);
    else
        printf("%d cannot be expressed as power of 2.", N);
}