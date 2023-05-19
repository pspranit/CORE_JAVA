import java.util.Scanner;

public class NumberProblem {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("SELECT CHOICE\n1:ARMSTRONG\n2:FIBONACCI\n3:ANAGRAM\n4:PALINDROME\n5:FACTORIAL\n6:PRIME");
        int choice=sc.nextInt();
        switchCase(choice);

    }

    private static void switchCase(int choice) {
        Scanner sc=new Scanner(System.in);


        switch (choice)
        {
            case 1:
                System.out.println("CHECK ARMSTRONG NUMBER");
                int no=sc.nextInt();
                armstrongNo(no);
                break;

            case 2:

                System.out.println("CHECK FIBONACCI NUMBER");
                int fib=sc.nextInt();
                fibonacci(fib);
                break;

            case 3:
                String str="nitin";
                String str2="niti";
                anagramString(str,str2);
                break;

            case 4:
                System.out.println("CHECK PALINDROME NUMBER");
                int no1=sc.nextInt();
                palindromeNo(no1);
                break;

            case 5:
                System.out.println("CHECK FACTORIAL NUMBER");
                int no2=sc.nextInt();
                factorial(no2);
                break;

            case 6:
                System.out.println("CHECK PRIME NUMBER");
                int no3=sc.nextInt();
                checkPrime(no3);
                break;

            default:
                System.out.println("INVALID CHOICE");
        }
    }

    private static void fibonacci(int no)
    {
        int firstNo=0,secondNo=1,result;
        while (true) {
            result = firstNo + secondNo;
            if (result >= no) {
                break;
            }

            firstNo = secondNo;
            secondNo = result;

            System.out.println("FIBONACCI : " + result);
        }

    }
    private static void armstrongNo(int no)
    {
        int n=0;
        int sum=0;

        int i=no;
        while(no>0)
        {
            n=no%10;
            sum=sum+(n*n*n);
            no=no/10;
        }
        if (i==sum)
        {
            System.out.println(i+" : IS ARMSTRONG NUMBER");
        }
        else {
            System.out.println(i+" : IS NOT ARMSTRONG NUMBER");
        }
    }

    private static void anagramString(String str,String str2) {

        int no1=str.length();
        int no2=str2.length();
        boolean status=true;
        if(no1==no2)
        {
            char [] arr1=str.toCharArray();
            char [] arr2=str2.toCharArray();

            for (int i = 0; i < arr1.length; i++) {
                if(!(arr1[i]==arr2[i]))
                {
                    status=false;
                    break;
                }
                else {
                    status=true;
                }
            }
            if (status)
            {
                System.out.println(str+": is anagram");
            }
        }
        else {
            System.out.println(str+": not is anagram");
        }

    }


    private static void palindromeNo(int no) {

        int temp=no,res,sum = 0;
        while (no>0)
        {
            res=no%10;
            sum=(sum*10)+res;
            no=no/10;
        }
        if (temp==sum)
        {
            System.out.println("PALINDROME");
        }
        else {
            System.out.println("NO IS NOT PALINDROME");
        }

    }

    static int fact=1;
    private static void factorial(int no) {

        for (int i = 1; i <=no; i++) {
            fact=i*fact;
        }
        System.out.println(no+" FACTORIAL IS =: "+fact);
    }

    private static void checkPrime(int no) {

        int count=0;
        for (int i = 1; i <= no; i++) {
            if(no%i==0)
            {
                count++;
            }
        }
        if (count==2)
        {
            System.out.println(no+" :IS A PRIME NUMBER ");
        }else {
            System.out.println(no+" :IS A NOT PRIME NUMBER ");
        }
    }


}
