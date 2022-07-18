package com.bridgelabz.AssignmentDay11and12;

import java.util.Scanner;
public class Account {
    double accountBalance;

    public Account(double accountBalance) {
        this.accountBalance = accountBalance;
    }

    public void debitAmount() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Amount that you want to withdraw:");
        int debitAmount = sc.nextInt();

        if (debitAmount < accountBalance) {
            accountBalance-= debitAmount;
            System.out.println("Debit amount is : " + debitAmount);
            System.out.println("Account balance after withdrawal is : " + accountBalance);
        } else {
            System.out.println("Debit amount has exceeded Account balance");
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the account balance : ");
        Account account = new Account(sc.nextDouble());
        account.debitAmount();

    }
}
