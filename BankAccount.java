class BankAccount {

    String accountNumber;
    String holderName;
    double balance;

    BankAccount(String accNo, String name, double bal) {
        accountNumber = accNo;
        holderName = name;
        balance = bal;
    }

    void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println(holderName + " deposited Rs. " + amount);
        } else {
            System.out.println("Invalid deposit amount");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println(holderName + " withdrew Rs. " + amount);
        } else {
            System.out.println("Insufficient balance or invalid amount");
        }
    }
    
    void displayBalance() {
        System.out.printf(holderName + "'s Balance: Rs. %.2f%n", balance);
    }
}