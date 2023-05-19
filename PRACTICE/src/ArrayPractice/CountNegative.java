package ArrayPractice;

import java.util.Scanner;

public class CountNegative {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SIZE");
        int size=sc.nextInt();

        int[] arr =new int[size];
        int nCount=0,pCount=0;
        System.out.println("ENTER ELEMENT");
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            if(arr[i]>0)
            {
                pCount++;
            }
            else {
                nCount++;
            }
        }
        System.out.println("NAGATIVE COUNT ARE :"+nCount);
        System.out.println("POSITIVE COUNT ARE : "+pCount);
    }
}
