public class BankAccount {

    private String accountHolderName;
    private int accountNumber;
    private double balance;
    private String transactionHistory;

    public BankAccount(String accountHolderName, int accountNumber, double balance) {

        this.accountHolderName = accountHolderName;
        this.accountNumber = accountNumber;
        this.balance = balance;

        transactionHistory = "Account Created with Balance : ₹" + balance + "\n";
    }

    public void deposit(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Deposit Amount!");
            return;
        }

        balance += amount;

        transactionHistory += "Deposited : ₹" + amount + "\n";

        System.out.println("₹" + amount + " Deposited Successfully.");
    }

    public void withdraw(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid Withdrawal Amount!");
            return;
        }

        if (amount > balance) {
            System.out.println("Insufficient Balance!");
            return;
        }

        balance -= amount;

        transactionHistory += "Withdraw : ₹" + amount + "\n";

        System.out.println("₹" + amount + " Withdrawn Successfully.");
    }

    public void showBalance() {

        System.out.println("\nCurrent Balance : ₹" + balance);

    }

    public void showTransactionHistory() {

        System.out.println("\n===== Transaction History =====");

        System.out.println(transactionHistory);

    }

}