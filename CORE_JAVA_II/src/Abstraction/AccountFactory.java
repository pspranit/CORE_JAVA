package Abstraction;

public class AccountFactory {
    Account createAccount(int type,double balance)
    {
        Account a1=null;
        if(type==1)
        {
           a1=new SavingAccount(balance);
        }
        else if(type==2)
        {
            a1=new LoanAccount(balance);
        }
        return a1;
    }
}
