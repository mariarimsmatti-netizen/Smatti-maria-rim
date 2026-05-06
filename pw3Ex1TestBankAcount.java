package pw3ex1;

public class TestBankAccount {

    public static void main(String[] args) {

        BankAccount acc = new BankAccount("Rami", 10000);

        acc.deposit(2000);
        acc.withdraw(5000);

        System.out.println(acc);
    }
}
