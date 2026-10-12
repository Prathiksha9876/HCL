
package service;

import model.BankAccount;

public class BankAccountService {

    public void deposit(BankAccount account, double amount) {
        account.deposit(amount);
    }

    public void withdraw(BankAccount account, double amount) {
        account.withdraw(amount);
    }

    public double getBalance(BankAccount account) {
        return account.getBalance();
    }
}
