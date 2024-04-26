package dev.eas;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6};
        System.out.println("Before Reverse: "+ Arrays.toString(array));
        int[] reverseArray = reverse(array);
        System.out.println("After Reverse: "+ Arrays.toString(reverseArray));
    }

    private static int[] reverse(int[] array) {
        int temp;
        for(int i = 0, j=array.length-1; i< (array.length/2); i++, j--) {
            temp = array[i];
            array[i] = array[j];
            array[j] = temp;
        }
        return array;
    }
}
