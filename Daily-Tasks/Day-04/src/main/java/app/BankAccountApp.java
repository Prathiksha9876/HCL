
package app;

import model.BankAccount;
import service.BankAccountService;

public class BankAccountApp {

    public static void main(String[] args) {

        BankAccount account = new BankAccount(
                "Arun", "ACC101", 5000.0);

        BankAccountService service = new BankAccountService();

        System.out.println("Initial Balance: Rs. "
                + service.getBalance(account));

        service.deposit(account, 1000.0);
        System.out.println("After Deposit: Rs. "
                + service.getBalance(account));

        service.withdraw(account, 2000.0);
        System.out.println("After Withdrawal: Rs. "
                + service.getBalance(account));
                BankAccount sameAccount = new BankAccount(
        "Arun", "ACC101", 1000.0);

System.out.println("Same Account? " + account.equals(sameAccount));
System.out.println(
        "Same Hash Code? "
        + (account.hashCode() == sameAccount.hashCode()));
        System.out.println("Total Accounts: "
                + BankAccount.getTotalAccounts());
    }
}
