package ArrayPractice;

import java.util.Scanner;

public class InsertAnywhere {
    public static void main(String[] args) {
        int loc;
        Scanner sc = new Scanner(System.in);
        System.out.println("Java Program to insert element at given location of Array");
        System.out.print("Enter the size of array: ");
        int size = sc.nextInt();
        int arr[] = new int[size + 1];
        for (int i = 0; i < size; i++) {
            System.out.print("Please give value for index " + i + " : ");
            arr[i] = sc.nextInt();
        }
        System.out.print("Enter the location where you want to insert:");
        loc = sc.nextInt();
        for (int i = size - 1; i >= loc - 1; i--) {
            arr[i + 1] = arr[i];
        }
        System.out.print("Enter the element to insert at location " + loc + " : ");
        arr[loc - 1] = sc.nextInt();
        System.out.println("Array After Inserting " + arr[loc - 1] + " at location " + loc + " : ");
        for (int i = 0; i < size + 1; i++) {
            System.out.print(arr[i]);
        }
    }
}
