class BankAccount {
    private String accountHolder;
    private int accountNumber;
    private double balance;
    private static int accountCount = 1000;

    public BankAccount(String accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = ++accountCount;
    }

    public int getAccountNumber() { return accountNumber; }
    public String getAccountHolder() { return accountHolder; }
    public double getBalance() { return balance; }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
            return true;
        }
        return false;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public Transaction transferTo(BankAccount target, double amount) {
        if (withdraw(amount)) {
            target.deposit(amount);
            return new Transaction(this.accountNumber, target.accountNumber, amount, "Success");
        }
        return new Transaction(this.accountNumber, target.accountNumber, amount, "Failed");
    }

    public void displayAccount() {
        System.out.println("Account No: " + accountNumber + ", Holder: " + accountHolder + ", Balance: " + balance);
    }
}

class Transaction {
    private int fromAccount;
    private int toAccount;
    private double amount;
    private String status;

    public Transaction(int fromAccount, int toAccount, double amount, String status) {
        this.fromAccount = fromAccount;
        this.toAccount = toAccount;
        this.amount = amount;
        this.status = status;
    }

    public void displayTransaction() {
        System.out.println("Transaction: From " + fromAccount + " To " + toAccount + ", Amount: " + amount + ", Status: " + status);
    }
}

public class BankApp {
    public static void main(String[] args) {
        BankAccount acc1 = new BankAccount("Alice", 5000);
        BankAccount acc2 = new BankAccount("Bob", 2000);

        acc1.displayAccount();
        acc2.displayAccount();

        Transaction t1 = acc1.transferTo(acc2, 1500);
        t1.displayTransaction();

        Transaction t2 = acc2.transferTo(acc1, 5000);
        t2.displayTransaction();

        acc1.displayAccount();
        acc2.displayAccount();
    }
}
