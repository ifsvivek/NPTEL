/*
 * Program to remove duplicate elements from sorted array
 * Follow the naming convention as given in the main method of the suffix code.
 */

import java.util.Scanner;

class W08_P4 {
    // from here
    public static int removeDuplicates(int[] array) {
        if (array.length == 0) {
            return 0;
        }

        int i = 0;
        for (int j = 1; j < array.length; j++) {
            if (array[j] != array[i]) {
                i++;
                array[i] = array[j];
            }
        }
        return i + 1;
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
        int index = removeDuplicates(array);
        for (i = 0; i < index; i++) {
            System.out.print(array[i] + " ");
        }
        s.close();
    }
}