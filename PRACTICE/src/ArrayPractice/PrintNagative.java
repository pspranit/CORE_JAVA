package ArrayPractice;

import java.util.Scanner;

public class PrintNagative {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ELEMENT");
        int size=sc.nextInt();
        int []arr=new int[size];

        for (int i = 0; i < arr.length ; i++) {

            arr[i]=sc.nextInt();
        }
        System.out.println("NAGATIVE ELEMENT ARE");
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]<0)
            {
                System.out.println(arr[i]+" ");
            }

        }
    }
}
