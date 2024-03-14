/*
Write a C program to find sum of following series where the value of N is taken as input

 1+ 1/2 + 1/3 + 1/4 + 1/5 + .. 1/N

Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
100
 Sum of the series is: 5.19
Sum of the series is: 5.19\n
Passed
Test Case 2
20
 Sum of the series is: 3.60
Sum of the series is: 3.60\n
Passed

Sample solutions (Provided by instructor)
*/
#include<stdio.h>
int main() {
    int N;
    float sum = 0.0;
    scanf("%d", &N); /*Read the value of N from test cases provided*/

    /* Complete the program. Please use the printf statement given below:

    printf("Sum of the series is: %.2f\n",sum);

    */
    int i;
    for (i = 1;i <= N;i++)
        sum = sum + ((float)1 / (float)i);
    printf("Sum of the series is: %.2f\n", sum);
}