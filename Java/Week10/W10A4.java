/*
 * Program to compute the sum of all prime numbers in a given range.
 * The range value will be positive.
 * Follow the naming convention as given in the main method of the suffix code.
 */

import java.util.Scanner;

public class W10_P4 {
    // from here
    public static int primeSum(int start, int end) {
        int sum = 0;
        for (int i = start; i <= end; i++) {
            if (isPrime(i)) {
                sum += i;
            }
        }
        return sum;
    }

    private static boolean isPrime(int num) {
        if (num <= 1) {
            return false;
        }
        for (int i = 2; i * i <= num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
    // till here

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();

        System.out.println(primeSum(x, y));
    }
}