/*
 * Write a Java program that utilizes multithreading to calculate and print the
 * squares of numbers from a specified begin to a specified end.
 * The main method is already created.
 * You need to design a SquareThread class that has two members,
 * int begin;
 * int end;
 * Each thread should sequentially print the squares of numbers from begin to
 * end (both inclusive).
 * The same code will be used to create another thread that prints the sqaure of
 * numbers from end to begin in reverse order.
 * (if begin is greater than end, print the square of each number in reverse
 * order first)
 * The main method will first call SquareThread with begin and end and then in
 * reverse order.
 * The class you create should be able to handle such case and print as required
 * in the correct order.
 * HINT: use the keyword `synchronized` in the run method.
 */

import java.util.Scanner;

class SquareThread extends Thread {
    private int begin;
    private int end;

    // from here
    public SquareThread(int begin, int end) {
        this.begin = begin;
        this.end = end;
    }

    synchronized public void run() {
        if (begin <= end) {
            for (int i = begin; i <= end; i++) {
                System.out.println(i * i);
            }
        } else {
            for (int i = begin; i >= end; i--) {
                System.out.println(i * i);
            }
        }
    }
    // to here
}

public class W9A1 {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        int begin = scanner.nextInt();
        int end = scanner.nextInt();
        scanner.close();

        SquareThread thread1 = new SquareThread(begin, end);
        SquareThread thread2 = new SquareThread(end, begin);

        thread1.start();
        thread2.start();
    }
}