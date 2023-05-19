package ArrayPractice;

import java.util.Scanner;

public class InsertElementEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int []arr={1,2,3,4,5};
        int size=arr.length;
        int [] arr2=new int[size+1];

        for (int i = 0; i < size; i++) {
            arr2[i]=arr[i];
        }
        System.out.println("ENTER ADD ELEMENT FROM END");
        arr2[size]=sc.nextInt();
        for(int a:arr2)
        {
            System.out.print(a+" ");
        }

      //  Scanner sc = new Scanner(System.in);
//        System.out.println("Java Program to insert element at end of Array");
//        System.out.print("Enter the size of array: ");
//        int size = 4;
//        int arr[] = new int[size+1];
//        for(int i=0; i<size; i++) {
//            System.out.print("Please give value for index "+ i +" : ");
//            arr[i] = sc.nextInt();
//        }
//        System.out.print("Enter the element to insert at end: ");
//        arr[size] = sc.nextInt();
//        System.out.println("Array After Inserting "+ arr[size] +" at end");
//        for(int i=0; i<size+1; i++)
//        {
//            System.out.println(arr[i]);
//        }
    }
}
