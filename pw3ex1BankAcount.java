package pw3ex1;

public class BankAccount {

    private String ownerName;
    private double balance;

    public BankAccount(String ownerName, double balance) {
        this.ownerName = ownerName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance!");
        }
    }

    public void setOwnerName(String name) {
        this.ownerName = name;
    }

    public String toString() {
        return "Owner: " + ownerName + " | Balance: " + balance;
    }
}
