import java.util.ArrayList;

class Bank {
    String bankName;
    ArrayList<Account> accounts;

    public Bank(String bankName) {
        this.bankName = bankName;
        accounts = new ArrayList<>();
    }

    public void openAccount(Customer customer, double initialBalance) {
        Account account = new Account(customer, this, initialBalance);
        accounts.add(account);
        customer.addAccount(account);
        System.out.println("Account opened for " + customer.name + " in " + bankName);
    }

    public void displayAccounts() {
        System.out.println("Accounts in " + bankName + ":");
        for (Account acc : accounts) {
            System.out.println("Customer: " + acc.customer.name + ", Balance: " + acc.balance);
        }
    }
}


class Customer {
    String name;
    ArrayList<Account> accounts;

    public Customer(String name) {
        this.name = name;
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public void viewBalances() {
        System.out.println("Accounts for " + name + ":");
        for (Account acc : accounts) {
            System.out.println("Bank: " + acc.bank.bankName + ", Balance: " + acc.balance);
        }
    }
}

class Account {
    Customer customer;
    Bank bank;
    double balance;

    public Account(Customer customer, Bank bank, double balance) {
        this.customer = customer;
        this.bank = bank;
        this.balance = balance;
    }
}

public class BankAndAccountHolders {
    public static void main(String[] args) {
        Bank bank1 = new Bank("Axis Bank");
        Bank bank2 = new Bank("HDFC Bank");

        Customer c1 = new Customer("Alice");
        Customer c2 = new Customer("Bob");

        bank1.openAccount(c1, 5000.0);
        bank1.openAccount(c2, 3000.0);

        bank2.openAccount(c1, 10000.0); // Alice has accounts in multiple banks

        c1.viewBalances();
        System.out.println();
        c2.viewBalances();
        System.out.println();
        
        bank1.displayAccounts();
        System.out.println();
        bank2.displayAccounts();
    }
}
