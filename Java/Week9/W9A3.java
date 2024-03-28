/*
 * The program given below stores characters in a byte array named byte_array,
 * which means ‘A’ is stored as 65.
 * 
 * Your task is the following:
 * 
 * § Given a user input `n`, print the output in the given format, if `n` = 1,
 * print:
 * 
 * o byte_array[1] = ‘P’
 * 
 * § If the value of n is negative or is out of bound, then use TRY_CATCH to
 * print the following:
 * 
 * o Array index is out of range
 */

import java.util.*;

public class W9A3 {
    public static void main(String[] args) {
        try {
            byte byte_array[] = {
                    'N', 'P', 'T', 'E', 'L', ' ',
                    '-', ' ',
                    'P', 'R', 'O', 'G', 'R', 'A', 'M', 'M', 'I', 'N', 'G', ' ',
                    'I', 'N', ' ',
                    'J', 'A', 'V', 'A'
            };
            Scanner inr = new Scanner(System.in);
            int n = inr.nextInt();
            inr.close();

            // from here
            System.out.print("byte_array[" + n + "] = '" + (char) byte_array[n] + "'");
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.print("Array index is out of range");
        }
        // till here
    }
}