package DesignPattern.Singleton;

import java.util.Scanner;

class GoogleAccount
{
    static GoogleAccount g1;
    static String userName="pranit";
    static int password=0000;

    private GoogleAccount()
    {
        System.out.println("CONSTRUCTOR");
    }

    static GoogleAccount login(String userName,int pass)
    {
        if(g1==null) {
            g1 = new GoogleAccount();
        }
        else {
            System.out.println("ALREADY LOGIN");
        }
             if (userName==userName && pass==password)
             {
                 System.out.println("LOGIN SUCCESSFUL");
            }
            else {
            System.out.println("CHECK USERNAME AND PASSWORD");
            System.exit(0);
            }

        return g1;
    }

    void accessGmail(){
        System.out.println("ACCESS GMAIL");
    }

    void accessDrive()
    {
        System.out.println("ACCESS DRIVE");
    }
}
public class MainApp1 {
    public static void main(String[] args) {

       // GoogleAccount g1=new GoogleAccount();  //NA
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER USERNAME");
        String userName=sc.next();

        System.out.println("ENTER PASSWORD");
        int pass=sc.nextInt();

        GoogleAccount g=GoogleAccount.login(userName,pass);
        g.accessGmail();
        g.accessDrive();

        System.out.println("..................");

        GoogleAccount g2=GoogleAccount.login(userName,pass);
        g2.accessGmail();
        g2.accessDrive();


//      2nd way
//      GoogleAccount.g1.login();
//        GoogleAccount.g1.accessGmail();
//        GoogleAccount.g1.accessDrive();
    }
}
