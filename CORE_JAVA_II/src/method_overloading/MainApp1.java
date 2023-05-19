package method_overloading;

import java.util.Scanner;

public class MainApp1 {
    public static void main(String[] args) {

        Student s=new Student();
        Scanner sc=new Scanner(System.in);
        System.out.println("SELECT YOUR CRITERIA");
        System.out.println("1.SEARCH BY NAME\n2.SEARCH BY CONT_NO");
        int choice=sc.nextInt();

        if(choice==1)
        {
            System.out.println("ENTER YOUR NAME");
            String name=sc.next();
            s.search(name);
        }

        else if (choice==2)
        {
            System.out.println("ENTER YOUR CONT_NO");
            long cNo=sc.nextLong();
            s.search(cNo);
        }
        else
        {
            System.out.println("INVALID CHOICE");
        }
    }
}
