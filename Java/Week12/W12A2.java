/*
 * Write a program that validates a user's password based on the following
 * criteria (in the following order):
 * 
 * § 1. The password must be at least 8 characters long.
 * 
 * § 2. The password must contain at least one uppercase letter (A-Z).
 * 
 * § 3. The password must contain at least one lowercase letter (a-z).
 * 
 * § 4. The password must contain at least one digit (0-9).
 * 
 * Take the following assumptions regarding the input:
 * 
 * § The input will not contain any spaces
 * 
 * Your output should print the rule that it violates exactly as defined above.
 * 
 * If the password violates multiple rules then the first rule it violates
 * should take priority.
 */

import java.util.Scanner;

public class W12_P2 {
    // from here
    public static void validatePassword(String password) {
        if (password.length() < 8) {
            System.out.println("Your password is invalid.");
            System.out.println("The password must be at least 8 characters long.");
        } else if (!password.matches(".*[A-Z].*")) {
            System.out.println("Your password is invalid.");
            System.out.println("The password must contain at least one uppercase letter (A-Z).");
        } else if (!password.matches(".*[a-z].*")) {
            System.out.println("Your password is invalid.");
            System.out.println("The password must contain at least one lowercase letter (a-z).");
        } else if (!password.matches(".*[0-9].*")) {
            System.out.println("Your password is invalid.");
            System.out.println("The password must contain at least one digit (0-9).");
        } else {
            System.out.println("Your password is valid.");
        }
    }
    // till here

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter your password: ");
        String password = scanner.nextLine();
        scanner.close();

        validatePassword(password);
    }
}