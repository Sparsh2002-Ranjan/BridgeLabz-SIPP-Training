class BankAccount {
    static String bankName = "State Bank of Java";
    static int totalAccounts = 0;

    final int accountNumber;
    String accountHolderName;
    double balance;

    BankAccount(int accountNumber, String accountHolderName, double balance) {
        this.accountNumber = accountNumber;       // 'this' used to resolve shadowing
        this.accountHolderName = accountHolderName;
        this.balance = balance;
        totalAccounts++;                           // increment total accounts
    }

    static void getTotalAccounts() {
        System.out.println("Total Bank Accounts: " + totalAccounts);
    }

    void displayDetails() {
        System.out.println("Bank Name: " + bankName);
        System.out.println("Account Holder: " + accountHolderName);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: $" + balance);
        System.out.println("-----------------------------");
    }
}

public class Bank {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount(101, "Alice", 5000.0);
        BankAccount acc2 = new BankAccount(102, "Bob", 3000.0);

        if (acc1 instanceof BankAccount) {
            acc1.displayDetails();
        }

        if (acc2 instanceof BankAccount) {
            acc2.displayDetails();
        }

        BankAccount.getTotalAccounts();
    }
}
