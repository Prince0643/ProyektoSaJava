
import java.util.ArrayList;
import java.util.Scanner;

class BankAccount {

    private String accountNumber;
    private String accountHolder;
    private double balance;
    private ArrayList<String> transactionHistory;
    private final double interestRate = 0.05;

    public BankAccount(String accountNumber, String accountHolder, double initialDeposit) {
        if (accountNumber.matches("\\d{10}")) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Invalid account number. It must be exactly 10 digits.");
            return;
        }

        if (accountHolder != null && !accountHolder.trim().isEmpty()) {
            this.accountHolder = accountHolder;
        } else {
            System.out.println("Invalid account holder name.");
            return;
        }

        if (initialDeposit >= 0) {
            this.balance = initialDeposit;
        } else {
            System.out.println("Initial deposit must be non-negative.");
            return;
        }

        this.transactionHistory = new ArrayList<>();
        transactionHistory.add("Initial Deposit: $" + initialDeposit);
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public String getAccountHolder() {
        return accountHolder;
    }

    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount <= 0) {
            System.out.println("Deposit amount must be greater than zero.");
            return;
        }
        balance += amount;
        transactionHistory.add("Deposit: $" + amount);
        System.out.println("Deposit successful. New Balance: $" + balance);
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Withdrawal amount must be greater than zero.");
            return;
        }
        if (amount > balance) {
            System.out.println("Insufficient funds.");
            return;
        }
        balance -= amount;
        transactionHistory.add("Withdrawal: $" + amount);
        System.out.println("Withdrawal successful. New Balance: $" + balance);
    }

    public void applyInterest() {
        double interest = balance * interestRate;
        balance += interest;
        transactionHistory.add("Interest Applied: $" + interest);
        System.out.println("Interest applied. New Balance: $" + balance + " (Interest Rate: 5% annual)");
    }

    public void viewTransactionHistory() {
        System.out.println("--- Transaction History ---");
        for (String transaction : transactionHistory) {
            System.out.println("- " + transaction);
        }
    }
}

public class BankingSystem {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        BankAccount account = null;

        while (true) {
            System.out.println("\nWelcome to the Secure Banking System");
            System.out.println("1. Create Account");
            System.out.println("2. View Account Details");
            System.out.println("3. Deposit Money");
            System.out.println("4. Withdraw Money");
            System.out.println("5. Apply Interest");
            System.out.println("6. View Transaction History");
            System.out.println("7. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Enter Account Number (10 digits): ");
                    String accNumber = scanner.nextLine();
                    System.out.print("Enter Account Holder Name: ");
                    String accHolder = scanner.nextLine();
                    System.out.print("Enter Initial Deposit: ");
                    double initialDeposit = scanner.nextDouble();
                    account = new BankAccount(accNumber, accHolder, initialDeposit);
                    if (account.getAccountNumber() != null) {
                        System.out.println("Account created successfully!");
                    }
                    break;
                case 2:
                    if (account != null) {
                        System.out.println("--- Account Details ---");
                        System.out.println("Account Number: " + account.getAccountNumber());
                        System.out.println("Account Holder: " + account.getAccountHolder());
                        System.out.println("Balance: $" + account.getBalance());
                    } else {
                        System.out.println("No account found. Please create one first.");
                    }
                    break;
                case 3:
                    if (account != null) {
                        System.out.print("Enter deposit amount: ");
                        double depositAmount = scanner.nextDouble();
                        account.deposit(depositAmount);
                    } else {
                        System.out.println("No account found. Please create one first.");
                    }
                    break;
                case 4:
                    if (account != null) {
                        System.out.print("Enter withdrawal amount: ");
                        double withdrawAmount = scanner.nextDouble();
                        account.withdraw(withdrawAmount);
                    } else {
                        System.out.println("No account found. Please create one first.");
                    }
                    break;
                case 5:
                    if (account != null) {
                        account.applyInterest();
                    } else {
                        System.out.println("No account found. Please create one first.");
                    }
                    break;
                case 6:
                    if (account != null) {
                        account.viewTransactionHistory();
                    } else {
                        System.out.println("No account found. Please create one first.");
                    }
                    break;
                case 7:
                    System.out.println("Exiting program...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
