public class BankAccount {
    double balance = 0;

    public void deposit(double amt) {
        balance = balance + amt;
    }

    public void withdraw(double amt) {
        balance = balance - amt;
    }
}
