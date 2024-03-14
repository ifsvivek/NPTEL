/*
Write a C program to read Two One Dimensional Arrays of same data type (integer type) and merge them into another One Dimensional Array of same type.
Private Test cases used for evaluation	Input	Expected Output	Actual Output	Status
Test Case 1
3
15
45
25
3
60
70
80
 15\n
45\n
25\n
60\n
70\n
80
15\n
45\n
25\n
60\n
70\n
80\n
Passed
Test Case 2
4
90
80
10
30
2
25
75
 90\n
80\n
10\n
30\n
25\n
75
90\n
80\n
10\n
30\n
25\n
75\n
Passed

Sample solutions (Provided by instructor)
*/

#include<stdio.h>
int main() {
    int arr1[20], arr2[20], array_new[40], n1, n2, size, i;
    /*n1 size of first array (i.e. arr1[]), n2 size of second array(i.e. arr2[]),
      size is the total size of the new array (array_new[]) */

    scanf("%d", &n1); //Get the size of first array from test data and store it in n1.

    for (i = 0; i < n1; i++)
        scanf("%d", &arr1[i]); //Accepts the values for first array 

    scanf("%d", &n2); //Get the size of second array from test data and store it in n2.

    for (i = 0; i < n2; i++)
        scanf("%d", &arr2[i]); //Accepts the values for second array

    //Marge two arrays
    int j;
    for (i = 0;i < n1;++i)
        array_new[i] = arr1[i];

    size = n1 + n2;

    for (i = 0, j = n1; j < size && i < n2; ++i, ++j)
        array_new[j] = arr2[i];
    //Printing after merging

    for (i = 0; i < size; i++) {
        printf("%d\n", array_new[i]);
    }

}