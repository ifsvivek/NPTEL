package dev.eas;

import java.util.Arrays;
import java.util.Scanner;

public class MinElement {
    public static void main(String[] args) {
        int[] returnedArray = readIntegers();
        System.out.println(Arrays.toString(returnedArray));

        int returnedMin = findMin(returnedArray);
        System.out.println("min = "+ returnedMin);

        int[] reverseArray = reverse(returnedArray);
        System.out.println("After Reverse: "+ Arrays.toString(reverseArray));

    }

    private static int[] readIntegers(){

        Scanner s = new Scanner(System.in);
        System.out.println("Enter the list of integers, separated by commas: ");
        String input = s.nextLine();

        String[] splits = input.split(",");
        int[] values = new int[splits.length];

        for(int i = 0; i < splits.length; i++) {
            values[i] = Integer.parseInt(splits[i].trim());
        }
        return values;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int el: array) {
            if(el < min) {
                min = el;
            }
        }
        return min;
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
