package models;

public class BankAccount {
    private String holder;
    private String accountNumber;
    private double balance;
    private double tax = 5.00;

    public BankAccount(String holder, String accountNumber) {
        this.holder = holder;
        this.accountNumber = accountNumber;
    }

    public BankAccount(String holder, String accountNumber, double initialDepositValue) {
        this.holder = holder;
        this.accountNumber = accountNumber;
        deposit(initialDepositValue);
    }

    public String getHolder() {
        return holder;
    }

    public void setHolder(String holder) {
        this.holder = holder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double value) {
        balance += value;
    }

    public void withdraw(double value) {
        balance -= value + tax;
    }

    public String toString() {
        return "Account " + accountNumber + ", Holder: " + holder + ", Balance: $ " + String.format("%.2f", balance);
    }

}