package constructor_call;

import java.util.Scanner;

//class Object
//{
//    Object()
//    {
//
//        System.out.println("SUPER OBJECT CLASS");
//    }
//}
class Univercity
{
    Univercity(String uName)
    {
        super();
        System.out.println("UNIVERCITY NAME:=> "+uName);
    }
}

class College extends Univercity
{
    College(String uName,String cName)
    {
        super(uName);
        System.out.println("COLLEGE NAME:=> "+cName);
    }
}

class Department extends College
{
    Department(String uName,String cName,String dName)
    {
        super(uName,cName);
        System.out.println("DEPARTMENT NAME:=> "+dName);
    }
}

public class MainApp3 {
    public static void main(String[] args)
    {
        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER UNIVERCITY NAME");
        String str1=sc.nextLine();

        System.out.println("ENTER COLLEGE NAME");
        String str2=sc.nextLine();

        System.out.println("ENTER DEPARTMENT NAME");
        String str3=sc.nextLine();

        Department d1=new Department(str1,str2,str3);
    }
}
