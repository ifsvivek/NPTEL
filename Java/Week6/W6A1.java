// Complete the code fragment to read two integer inputs from keyboard and find the quotient and remainder.

import java.util.Scanner;

public class W6A1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        // code for quotient and remainder
        int q = x / y;
        int r = x % y;
        System.out.println("The Quotient is = " + q);
        System.out.println("The Remainder is = " + r);
    }
}