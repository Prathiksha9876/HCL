
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ATMSimulator {

    private static final int CORRECT_PIN = 1234;
    private static final int MAX_PIN_ATTEMPTS = 3;

    private static double balance = 5000.00;
    private static final List<String> transactions = new ArrayList<>();

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("===== ATM SIMULATOR =====");

        boolean authenticated = false;

        for (int attempt = 1; attempt <= MAX_PIN_ATTEMPTS; attempt++) {

            System.out.print("Enter your 4-digit PIN: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid input. Enter numbers only.");
                scanner.next();
                continue;
            }

            int enteredPin = scanner.nextInt();

            if (enteredPin == CORRECT_PIN) {
                authenticated = true;
                System.out.println("Login successful!");
                break;
            } else {
                System.out.println(
                    "Incorrect PIN. Attempts left: "
                    + (MAX_PIN_ATTEMPTS - attempt)
                );
            }
        }

        if (!authenticated) {
            System.out.println("Too many failed attempts. Card blocked.");
            scanner.close();
            return;
        }

        int choice = 0;

        do {
            System.out.println("\n===== ATM MENU =====");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit Money");
            System.out.println("3. Withdraw Money");
            System.out.println("4. Mini Statement");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Invalid choice. Enter a number.");
                scanner.next();
                continue;
            }

            choice = scanner.nextInt();

            switch (choice) {

                case 1:
                    System.out.printf(
                        "Available Balance: Rs. %.2f%n", balance
                    );
                    break;

                case 2:
                    System.out.print("Enter deposit amount: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid amount.");
                        scanner.next();
                        break;
                    }

                    double deposit = scanner.nextDouble();

                    if (deposit <= 0) {
                        System.out.println(
                            "Amount must be greater than zero."
                        );
                        break;
                    }

                    balance += deposit;
                    transactions.add("Deposited: Rs. " + deposit);
                    System.out.println("Deposit successful.");
                    break;

                case 3:
                    System.out.print("Enter withdrawal amount: ");

                    if (!scanner.hasNextDouble()) {
                        System.out.println("Invalid amount.");
                        scanner.next();
                        break;
                    }

                    double withdrawal = scanner.nextDouble();

                    if (withdrawal <= 0) {
                        System.out.println(
                            "Amount must be greater than zero."
                        );
                        break;
                    }

                    if (withdrawal > balance) {
                        System.out.println("Insufficient balance.");
                        break;
                    }

                    balance -= withdrawal;
                    transactions.add("Withdrawn: Rs. " + withdrawal);
                    System.out.println("Withdrawal successful.");
                    break;

                case 4:
                    System.out.println("\n===== MINI STATEMENT =====");

                    if (transactions.isEmpty()) {
                        System.out.println("No transactions available.");
                    } else {
                        for (String transaction : transactions) {
                            System.out.println(transaction);
                        }
                    }

                    System.out.printf(
                        "Current Balance: Rs. %.2f%n", balance
                    );
                    break;

                case 5:
                    System.out.println("Thank you for using the ATM.");
                    break;

                default:
                    System.out.println("Invalid menu choice.");
                    continue;
            }

        } while (choice != 5);

        scanner.close();
    }
}

