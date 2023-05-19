package Abstraction;

public class SavingAccount implements Account{
    private double balance;

    public SavingAccount(double balance) {
        this.balance = balance;
        System.out.println("ACCOUNT SUCCESSFULLY CREATED");
    }

    @Override
    public void deposit(double amt) {
        balance+=amt;
        System.out.println(amt+"RS CREDITED TO YOUR ACCOUNT");
    }

    @Override
    public void withDraw(double amt) {
        if (amt <= balance) {
            balance -= amt;
            System.out.println(amt + "RS DEBITED TO YOUR ACCOUNT");
        }
        else {
            System.out.println("INSUFFICIENT BALANCE");
        }
    }

    @Override
    public void checkBalance() {
        System.out.println("ACTIVE SAVING ACCOUNT BALANCE IS:"+balance);
    }
}