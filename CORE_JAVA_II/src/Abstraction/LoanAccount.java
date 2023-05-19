package Abstraction;

public class LoanAccount implements Account {
    double loanBalance;

    public LoanAccount(double loanBalance) {
        this.loanBalance = loanBalance;
        System.out.println("ACCOUNT SUCCESSFULLY CREATED");
    }

    @Override
    public void deposit(double amt) {
        loanBalance-=amt;
        System.out.println(amt+"RS CREDITED TO YOUR ACCOUNT");
    }

    @Override
    public void withDraw(double amt) {
        loanBalance += amt;
        System.out.println(amt + "RS DEBITED TO YOUR ACCOUNT");
    }

    @Override
    public void checkBalance() {
        System.out.println("ACTIVE LOAN ACCOUNT BALANCE IS:"+loanBalance);
    }
}
