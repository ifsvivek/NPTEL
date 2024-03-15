/*
Write a C Program to print Binary Equivalent of an Integer using Recursion
Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
30
 The binary equivalent of 30 is 11110
The binary equivalent of 30 is 11110\n
Passed
Test Case 2
111
 The binary equivalent of 111 is 1101111
The binary equivalent of 111 is 1101111\n
Passed


Sample solutions (Provided by instructor)
*/
#include <stdio.h>
int binary_conversion(int); //function to convert binary to decimal number
int main() {
    int num, bin;  //num is the decimal number and bin is the binary equivalent for the number

    scanf("%d", &num); //The decimal number is taken from the test case data
    bin = binary_conversion(num); //binary number is stored in variable bin
    printf("The binary equivalent of %d is %d\n", num, bin);
    return 0;
}
int binary_conversion(int num) {
    if (num == 0) {
        return 0;
    } else {
        return (num % 2) + 10 * binary_conversion(num / 2);
    }
}