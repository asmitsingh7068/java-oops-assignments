public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount();

        account.setAccountHolderName("Asmit Kumar Singh");
        account.setBalance(5000);

        account.displayAccountDetails();
    }
}