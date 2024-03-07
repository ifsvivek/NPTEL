/*
 * A BankAccount class with private field balance is provided,
 * Your task is to make the following:
 * a parameterized constructor to initialize the private field
 * public void deposit(...) // to deposit money
 * public void withdraw(...) // to withdraw money, should print
 * "Insufficient funds!" if not enough money to withdraw
 * public double getBalance() // to return the current balance
 */

package Week7;

import java.util.Scanner;

class BankAccount {
    private double balance;

    // From here
    public BankAccount(double initialBalance) {
        this.balance = initialBalance;
    }

    public void deposit(double amount) {
        this.balance += amount;
    }

    public void withdraw(double amount) {
        if (this.balance < amount) {
            System.out.println("Insufficient funds!");
        } else {
            this.balance -= amount;
        }
    }

    public double getBalance() {
        return this.balance;
    }
    // to here

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // System.out.print("Enter initial balance: ");
        double initialBalance = scanner.nextDouble();

        BankAccount account = new BankAccount(initialBalance);

        // System.out.print("Enter deposit amount: ");
        double depositAmount = scanner.nextDouble();
        account.deposit(depositAmount);

        // System.out.print("Enter withdrawal amount: ");
        double withdrawalAmount = scanner.nextDouble();
        account.withdraw(withdrawalAmount);

        System.out.print("Balance: " + account.getBalance());

        scanner.close();
    }
}