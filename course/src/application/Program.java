package application;

import entities.BankAccount;

import java.util.Locale;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        BankAccount bankAccount;

        System.out.print("Enter account number: ");
        int numberAccount = sc.nextInt();
        System.out.print("Enter account holder: ");
        sc.nextLine();
        String accountHolder = sc.nextLine();
        System.out.print("Is there na initial deposit (y/n)?: ");
        char decision = sc.next().charAt(0);

        if (decision == 'y') {
            System.out.print("Enter initial deposit value: ");
            double initialDeposit = sc.nextDouble();
            bankAccount = new BankAccount(numberAccount, accountHolder, initialDeposit);
        } else {
            bankAccount = new BankAccount(numberAccount, accountHolder);
        }

        System.out.println();
        System.out.println("Account data: ");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Enter a deposit value: ");
        double depositAmount = sc.nextDouble();
        bankAccount.deposit(depositAmount);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        System.out.println();
        System.out.print("Enter a withdraw value: ");
        double withdrawValue = sc.nextDouble();
        bankAccount.withdraw(withdrawValue);
        System.out.println();
        System.out.println("Updated account data: ");
        System.out.println(bankAccount);

        sc.close();
    }
}