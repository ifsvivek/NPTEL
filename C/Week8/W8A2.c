/*
Write a C Program to find power of a given number using recursion. The number and the power to be calculated is taken from test case
Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
16
3
 16^3 is 4096
16^3 is 4096
Passed


Sample solutions (Provided by instructor)
*/

#include <stdio.h>  
long power(int, int);
int main() {
    int pow, num;
    long result;

    scanf("%d", &num); //The number taken as input from test case data 

    scanf("%d", &pow); //The power is taken from the test case 
    result = power(num, pow);
    printf("%d^%d is %ld", num, pow, result);
    return 0;
}
long power(int num, int pow) {
    if (pow) {
        return (num * power(num, pow - 1));
    }
    return 1;
}