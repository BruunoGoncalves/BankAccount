package entities;

public class BankAccount {
    public int accountNumber;
    public String accountHolder;
    public double balance;

    public BankAccount(int accountNumber, String accountHolder) {

    };

    public BankAccount(int accountNumber, String accountHolder, double initialDeposit) {

    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public void setAccountHolder(String accountHolder) {
        this.accountHolder = accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
