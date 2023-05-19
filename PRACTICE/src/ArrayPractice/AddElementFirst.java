package ArrayPractice;

import java.util.Scanner;

public class AddElementFirst {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("ENTER ARRAY SIZE");
        int size=sc.nextInt();
        int arr2[]=new int[size+1];

        for (int i = 0; i < size; i++) {
            System.out.print("ARRAY INDEX :"+i+"=");
            arr2[i]=sc.nextInt();
        }
        System.out.println("ENTER ELEMENT OF FIRST POSITION");
        int newEle=50;
        System.out.println("FINAL ARRAY");

        for (int i = arr2.length-1; i > 0 ; i--) {
            arr2[i]=arr2[i-1];
        }
        arr2[0]=newEle;

        for(int a:arr2)
        {
            System.out.print(a+" ");
        }
    }
}
