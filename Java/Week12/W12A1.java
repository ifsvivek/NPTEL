/*
 * Write a program that calculates the letter grade based on a numerical score
 * entered by the user.
 * 
 * § >=80 - A
 * 
 * § 70-79 - B
 * 
 * § 60-69 - C
 * 
 * § 50-59 - D
 * 
 * § 40-49 - P
 * 
 * § <40 - F
 * 
 * Follow the naming convention as given in the main method of the suffix code.
 */

import java.util.Scanner;

public class W12_P1 {
    // from here
    public static char calculateGrade(int score) {
        if (score >= 80) {
            return 'A';
        } else if (score >= 70) {
            return 'B';
        } else if (score >= 60) {
            return 'C';
        } else if (score >= 50) {
            return 'D';
        } else if (score >= 40) {
            return 'P';
        } else {
            return 'F';
        }
    }

    // to here
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter the numerical score: ");
        int score = scanner.nextInt();
        scanner.close();
        // If score is greater than 100 or less than 0, print "Invalid Input"
        if (score > 100 || score < 0) {
            System.out.println("Invalid Input");
            return;
        }
        char grade = calculateGrade(score);
        System.out.println("Grade: " + grade);
    }
}