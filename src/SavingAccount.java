public class SavingAccount extends BankAccount{

    @Override
    public void withdraw(double amt) {
        double remaining=super.balance-amt;
        if(remaining<100){
            System.out.println("Sorry Your remaining balance is less than 100 ie.: "+remaining+" Rs.");
        }else{
            balance = balance - amt;
            System.out.println("Withdrawal Amount is: "+amt);
            System.out.println("Withdrawal Successful: Remaining Balance: "+balance);
        }
    }

    public static void main(String[] args) {
        SavingAccount sa = new SavingAccount();
        sa.deposit(200);
        sa.deposit(100);
        sa.deposit(200);
        sa.withdraw(200);
        sa.withdraw(151.20);
    }
}
/*


5. Write a Java program to create a class known as "BankAccount" with methods called deposit(double amt) and withdraw(double amt). Create a subclass called SavingsAccount that overrides the withdraw(double amt) method to prevent withdrawals if the account balance falls below one hundred.


 */

