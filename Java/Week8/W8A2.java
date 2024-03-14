/*
 * Program to Generate Harmonic Series.
 */

import java.util.Scanner;

class W08_P2 {
    public static void main(String... a) {
        Scanner s = new Scanner(System.in);
        int num = s.nextInt();

        // from here
        double result = 0.0;
        int i = 1;

        while (i <= num) {
            result = result + (double) 1 / i;
            i++;
        }

        System.out.println("Output of Harmonic Series is " + String.format("%.2f", result));

        s.close();
        // till here
    }
}