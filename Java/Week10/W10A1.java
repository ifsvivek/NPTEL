/*
 * Program to sort the elements of an array in ascending order. Follow the naming convention as given in the main method of the suffix code.
 */


import java.util.Scanner;

class W10_P1 {
    public static void printArray(int[] array) {
        // Iterating using for loops
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    // from here 
    public static void sortArray(int[] array) {
        int n = array.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    // swap array[j+1] and array[j]
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
    // till here

    public static void main(String... a) {
        Scanner s = new Scanner(System.in);
        int size = s.nextInt();
        int[] array = new int[size];
        int i;
        for (i = 0; i < size; i++) {
            array[i] = s.nextInt();
        }
        sortArray(array);
        // Displaying elements of array after sorting
        System.out.println(
                "Elements of array sorted in ascending order:");
        printArray(array);
    }
}