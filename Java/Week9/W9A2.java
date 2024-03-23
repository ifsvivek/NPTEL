/*
 * Complete the code segment to catch the exception in the following, if any.
 * 
 * On the occurrence of such an exception, your program should print
 * 
 * § Please enter valid data
 * 
 * If there is no such exception, it will print the square of the number
 * entered.
 */

import java.io.*;

class W09_P2 {
    public static void main(String args[]) {
        // from here
        InputStreamReader r = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(r);

        try {
            String number = br.readLine();
            int x = Integer.parseInt(number);
            System.out.print(x * x);
        } catch (IOException e) {
            System.out.print("Error reading input");
        } catch (NumberFormatException e) {
            System.out.print("Please enter valid data");
        }
        // to here
    }
}