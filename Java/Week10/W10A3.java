/*
 * Code to create two threads, one printing even numbers and the other printing
 * odd numbers.
 * 
 * The PrintNumbers class is declared, and it implements the Runnable interface.
 * This interface is part of Java's concurrency support and is used to represent
 * a task that can be executed concurrently by a thread.
 * Create a constructor of this class that takes two private instance variables
 * (start and end) to represent the range of numbers that will be printed by the
 * thread.
 * Create a run method that is required by the Runnable interface and contains
 * the code that will be executed when the thread is started. In this case, it
 * should prints odd numbers within the specified range (start to end) using a
 * for loop.
 * Hints: Thread.currentThread().getName() returns the name of the currently
 * executing thread, which is useful for identifying which thread is printing
 * the numbers.
 */


import java.util.Scanner;

class PrintNumbers implements Runnable {
    // from here
    private int start;
    private int end;

    public PrintNumbers(int start, int end) {
        this.start = start;
        this.end = end;
    }

    public void run() {
        for (int i = start; i <= end; i++) {
            if ((i % 2 == 0 && Thread.currentThread().getName().equals("EvenThread")) ||
                    (i % 2 != 0 && Thread.currentThread().getName().equals("OddThread"))) {
                System.out.println(Thread.currentThread().getName() + ": " + i);
            }
        }
    }
    // till here
}
public class W10_P3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int evenStart = scanner.nextInt();
        int evenEnd = scanner.nextInt();
        int oddStart = scanner.nextInt();
        int oddEnd = scanner.nextInt();

        Thread evenThread = new Thread(new PrintNumbers(evenStart, evenEnd), "EvenThread");
        Thread oddThread = new Thread(new PrintNumbers(oddStart, oddEnd), "OddThread");

        evenThread.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        oddThread.start();

        scanner.close();
    }
}