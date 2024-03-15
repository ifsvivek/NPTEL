/*
Write a C program to find the root of the equation using bisection method for
different values of allowable error of the root.
f(x) = 2x³-3x-5


Private Test cases used for evaluation Input	Expected Output	Actual Output	Status
Test Case 1                             0.01    Root = 1.7266   Root = 1.7266\n Passed


Sample solutions (Provided by instructor)
*/
#include<stdio.h>
float fun(float x); //Function fun returns the function value of f(x)
void bisection(float* x, float a, float b, int* itr); // This function computes the root of f(x) using bisection method

int main() {
    int itr = 0, maxmitr = 10;
    float x, a = 1.0, b = 2.0, allerr, x1; // x is the value of root in each iteration, x1 is the final value of the root 
    // a and b are the initial range for calculating the root using bisection method

    scanf("%f", &allerr);  // allerr is the allowable error taken from test case data 
    bisection(&x, a, b, &itr);

    /* Use the printf statement as given below to print the root
    printf("Root = %1.4f\n", x1); */
    do {
        if (fun(a) * fun(x) < 0)
            b = x;
        else
            a = x;
        bisection(&x1, a, b, &itr);
        if (((x1 - x) < 0 && -(x1 - x) < allerr) || ((x1 - x) > 0 && (x1 - x) < allerr)) {
            printf("Root = %1.4f\n", x1);
            return 0;
        }
        x = x1;
    } while (itr < maxmitr);
    return 1;
}
float fun(float x) {
    return (2 * x * x * x - 3 * x - 5);
}
void bisection(float* x, float a, float b, int* itr)
/* this function performs and prints the result of one iteration */
{
    *x = (a + b) / 2;
    ++(*itr);
}