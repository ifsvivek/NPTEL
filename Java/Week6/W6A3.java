// Complete the code segment to display the factors of a number n.


import java.util.Scanner;

public class W6A3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        //Use while or for loop to find the factors of a number.
        for (int i = 1; i <= num; i++) {
            if (num % i == 0) {
                System.out.print(i + " ");
            }
        }
    }
}
