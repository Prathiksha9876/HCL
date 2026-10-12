
package model;

public class BankAccount {

    private String accountHolder;
    private String accountNumber;
    private double balance;

    private static int totalAccounts = 0;

    // Constructor 1
    public BankAccount() {
        this("Unknown", "UNASSIGNED", 0.0);
    }

    // Constructor 2
    public BankAccount(String accountHolder, String accountNumber) {
        this(accountHolder, accountNumber, 0.0);
    }

    // Constructor 3
    public BankAccount(String accountHolder,
                       String accountNumber,
                       double balance) {

        if (accountHolder == null || accountHolder.isBlank()) {
            throw new IllegalArgumentException(
                    "Account holder is required");
        }

        if (accountNumber == null || accountNumber.isBlank()) {
            throw new IllegalArgumentException(
                    "Account number is required");
        }

        if (balance < 0) {
            throw new IllegalArgumentException(
                    "Balance cannot be negative");
        }

        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = balance;

        totalAccounts++;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Deposit amount must be positive");
        }

        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            throw new IllegalArgumentException(
                    "Withdrawal amount must be positive");
        }

        if (amount > balance) {
            throw new IllegalArgumentException(
                    "Insufficient balance");
        }

        balance -= amount;
    }

    public double getBalance() {
        return balance;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public static int getTotalAccounts() {
        return totalAccounts;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof BankAccount)) {
            return false;
        }

        BankAccount other = (BankAccount) obj;

        return accountNumber.equals(other.accountNumber);
    }

    @Override
    public int hashCode() {
        return accountNumber.hashCode();
    }
}
