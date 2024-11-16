package entities;

public class BankAccount {
    private int numberAccount;
    private String accountHolder;
    private double balance;

    public BankAccount(int numberAccount, String accountHolder) {
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
    }

    public BankAccount(int numberAccount, String accountHolder, double initialDeposit) {
        this.numberAccount = numberAccount;
        this.accountHolder = accountHolder;
        deposit(initialDeposit);
    }

    public int getNumberAccount() {
        return numberAccount;
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

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        balance -= amount + 5.00;
    }

    public String toString() {
        return "Account: "
                + numberAccount
                + ", Holder: "
                + accountHolder
                + ", Balance: $ "
                + String.format("%.2f", balance);
    }

}