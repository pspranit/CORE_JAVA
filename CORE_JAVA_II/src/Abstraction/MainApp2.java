package Abstraction;

import java.util.Scanner;

public class MainApp2 {
    public static void main(String[] args) {
        Scanner sc1=new Scanner(System.in);
        System.out.println("Select Account Type");
        System.out.println("1.SAVINGS");
        System.out.println("2.LOAN");
        int accType = sc1.nextInt();
        System.out.println("Enter Account Opening Balance");
        double balance = sc1.nextDouble();

        AccountFactory factory = new AccountFactory();
        Account accRef = factory.createAccount(accType,balance);
        boolean status =true;
        while (status){
            System.out.println("Select Mode of Transaction");
            System.out.println("1.Deposit\n2.Withdraw\n3.Check Balance\n4.Exit");
            int choice = sc1.nextInt();
            if (choice==1){
                System.out.println("ENTER AMOUNT");
                double amt =sc1.nextDouble();
                accRef.deposit(amt);
            } else if (choice==2){
                System.out.println("ENTER AMOUNT");
                double amt=sc1.nextDouble();
                accRef.withDraw(amt);
            } else if (choice==3) {
                accRef.checkBalance();
            } else {
                status=false;
            }
        }
    }
}
