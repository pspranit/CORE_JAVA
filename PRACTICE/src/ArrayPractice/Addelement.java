package ArrayPractice;

import java.util.Scanner;

public class Addelement {

    public static void main(String[] args) {


        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER ELEMENT");
        int size=sc.nextInt();
        int arr[]=new int[size];


        for (int i = 0; i < size; i++) {
            arr[i]=sc.nextInt();
        }
        System.out.println("ENTERED ELEMENT");
        int count=0;
        for(int a:arr)
        {
            System.out.print(a+" ");
            count++;
        }
        System.out.println();
        System.out.println(count);
    }
}

