public class BankMain {
    public static void main(String[] args) {

        BankAccount acc1 = new BankAccount("ACC101", "Ram", 5000);
        BankAccount acc2 = new BankAccount("ACC102", "Sita", 8000);

        acc1.deposit(2000);
        acc1.withdraw(1500);

        acc2.deposit(1000);
        acc2.withdraw(3000);

        System.out.println("\nFinal Balances:");
        acc1.displayBalance();
        acc2.displayBalance();
    }
}