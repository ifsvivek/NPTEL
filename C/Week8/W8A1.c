/*
Write a C Program to find HCF of 4 given numbers using recursive function
Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
50
455
60
200
 The HCF is 5
The HCF is 5
Passed
Test Case 2
67
89
45
41
 The HCF is 1
The HCF is 1
Passed


Sample solutions (Provided by instructor)
*/

#include<stdio.h>
int HCF(int, int); //You have to write this function which calculates the HCF. 

int main() {
    int a, b, c, d, result;
    scanf("%d %d %d %d", &a, &b, &c, &d); /* Takes 4 number as input from the test data */
    result = HCF(HCF(a, b), HCF(c, d));
    printf("The HCF is %d", result);
}

//Complete the rest of the program to calculate HCF
int HCF(int x, int y) {
    while (x != y) {
        if (x > y) {
            return HCF(x - y, y);
        } else {
            return HCF(x, y - x);
        }
    }
    return x;
}