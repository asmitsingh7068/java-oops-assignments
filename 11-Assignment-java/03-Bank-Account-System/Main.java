import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        // Create Bank Account
        

        System.out.println("========== BANK ACCOUNT ==========");

        System.out.print("Enter Account Holder Name : ");
        String name = sc.nextLine();

        System.out.print("Enter Account Number : ");
        int accountNumber = sc.nextInt();

        System.out.print("Enter Initial Balance : ");
        double balance = sc.nextDouble();

        BankAccount account =
                new BankAccount(name, accountNumber, balance);

        int choice;

    
        // Menu Loop
       
        while (true) {

            System.out.println("\n========== MENU ==========");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");

            System.out.print("Enter Your Choice : ");

            choice = sc.nextInt();

            switch (choice) {

                case 1:

                    System.out.print("Enter Deposit Amount : ");

                    double depositAmount = sc.nextDouble();

                    account.deposit(depositAmount);

                    break;

                case 2:

                    System.out.print("Enter Withdraw Amount : ");

                    double withdrawAmount = sc.nextDouble();

                    account.withdraw(withdrawAmount);

                    break;

                case 3:

                    account.showBalance();

                    break;

                case 4:

                    account.showTransactionHistory();

                    break;

                case 5:

                    System.out.println("\nThank You!");
                    System.out.println("Visit Again.");

                    sc.close();

                    return;

                default:

                    System.out.println("Invalid Choice!");

            }

        }

    }

}