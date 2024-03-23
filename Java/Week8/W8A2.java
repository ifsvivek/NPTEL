/*
 * Program to Generate Harmonic Series.
 */

import java.util.Scanner;

class W08_P2 {
    public static void main(String... a) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();
        double result = 0.0;
        while (num > 0) {
            result = result + (double) 1 / num;
            num--;
            // System.out.print(result +" ");
        }
        // System.out.println("");
        System.out.println("Output of Harmonic Series is " + result);
    }
}