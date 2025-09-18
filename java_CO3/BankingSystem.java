class Account {
    protected double balance;

    public Account(double balance) {
        this.balance = balance;
    }

    public final String getAccountType() {
        return "Generic Account";
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) balance -= amount;
        else System.out.println("Insufficient funds!");
    }
}

class SavingsAccount extends Account {
    public SavingsAccount(double balance) {
        super(balance);
    }
}

public class BankingSystem {
    public static void main(String[] args) {
        Account acc = new SavingsAccount(1000);
        System.out.println("Account Type: Savings");
        acc.withdraw(500);
        System.out.println("Balance after withdrawal: " + acc.balance);
    }
}
