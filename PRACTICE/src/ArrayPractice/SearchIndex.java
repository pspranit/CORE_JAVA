package ArrayPractice;

import java.util.Scanner;

public class SearchIndex {
    public static void main(String[] args) {
        int arr[]={10,20,30,40};

        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER INDEX NUMBER");
        int index=sc.nextInt();
        int found=-1;
        for (int i = 0; i < arr.length; i++) {
            if(index==arr[i]){
                found=i;
                break;
            }
        }
        if(found!=-1){
            System.out.println("NUMBER IS PRESENT IN THE ARRAY AT THE INDEX NO:"+found);
        }
        else {
            System.out.println("NUMBEER IS NOT PRESENT IN THE ARRAY");
        }
    }
}
