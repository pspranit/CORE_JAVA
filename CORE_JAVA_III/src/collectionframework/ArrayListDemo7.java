package collectionframework;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListDemo7 {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER START POINT");
        int start=sc.nextInt();
        System.out.println("ENTER END POINT");
        int end=sc.nextInt();

        ArrayList <Integer> even=new ArrayList<>();
        ArrayList <Integer> odd=new ArrayList<>();

        for (int i = start; i <= end; i++) {
            if(i%2==0)
            {
                even.add(i);
            }
            else
            {
                odd.add(i);
            }
        }
        System.out.println("EVEN LIST :"+even);
        System.out.println("ODD LIST :"+odd);
    }
}
