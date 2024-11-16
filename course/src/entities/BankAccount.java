package entities;

public class BankAccount {
    public int numberAccount;
    public String accountHolder;
    public double balance;

    public BankAccount(int numberAccount, String accountHolder, double balance) {
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
        this.balance = balance;
    }


}