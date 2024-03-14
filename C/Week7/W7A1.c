/*
Write a C Program to Count Number of Uppercase and Lowercase Letters in a given string. The given string may be a word or a sentence.
Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
Problem Solving through Programming in C.
 Uppercase Letters : 4\n
Lowercase Letters : 31
Uppercase Letters : 4\n
Lowercase Letters : 31
Passed
Test Case 2
AICTE Approved FDP Course
 Uppercase Letters : 10\n
Lowercase Letters : 12
Uppercase Letters : 10\n
Lowercase Letters : 12
Passed

Sample solutions (Provided by instructor)
*/
#include<stdio.h>
int main() {
    int upper = 0, lower = 0;
    char ch[100];
    scanf(" %[^\n]s", ch);  /*A word or a sentence is accepted from test case data */

    /* Complete the remaining part of the code to store number of uppercase letters
    in the variable upper and lowercase letters in variable lower.
    The print part of already written. You can declare any variable if necessary */
    int i = 0;
    while (ch[i] != '\0') {
        if (ch[i] >= 'A' && ch[i] <= 'Z')
            upper++;
        if (ch[i] >= 'a' && ch[i] <= 'z')
            lower++;
        i++;
    }
    printf("Uppercase Letters : %d\n", upper); /*prints number of uppercase letters */
    printf("Lowercase Letters : %d", lower); /*prints number of lowercase letters */

    return (0);
}