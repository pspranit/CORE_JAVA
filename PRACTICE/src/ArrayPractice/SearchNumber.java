package ArrayPractice;

import java.util.Scanner;

public class SearchNumber {
    public static void main(String[] args) {

        int arr[]={10,20,30,40};
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER SEARCH NUMBER");
        int search=sc.nextInt();
        boolean status=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == search) {
                status=true;
                break;
            }
        }
        if(status)
        {
            System.out.println("NUMBER IS PRESENT :=>"+search);
        }
        else {
            System.out.println("NUMBER NOT PRESENT");
        }

    }
}
