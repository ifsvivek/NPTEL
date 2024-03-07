/*
 * Write a program which will print a pattern of "*" 's of height "n".
 * For example:
 * Input:
 * n = 3
 * Output:
 ***
 **
 *
 **
 ***
 */

import java.util.*;

public class W6A5 {
    public static void main(String[] args) {
        Scanner inr = new Scanner(System.in);
        int n = inr.nextInt();
        int i, j;
        for (i = n; i > 0; i--) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        for (i = 2; i <= n; i++) {
            for (j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
