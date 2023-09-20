public class Main {
    public static void main(String[] args) {
        PersonalAccount account = new PersonalAccount(708, "Kerimalieva Zarina");
        account.deposit(890);
        account.withdraw(560);
        account.deposit(999);

        System.out.println("Account Holder: " + account.getAccountHolder());
        System.out.println("Account Number: " + account.getAccountNumber());
        System.out.println("Balance: $" + account.getBalance());
        System.out.println("\nTransaction History:");
        account.printHistory();
    }
}