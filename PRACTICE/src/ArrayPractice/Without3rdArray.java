package ArrayPractice;

import java.util.Arrays;

public class Without3rdArray {

    public static void main(String[] args) {

        System.out.println("MERGE TO ARRAY");
        int arr1[]={5,4,3,2,0};
        int arr2[]={1,5,3,4,2};

        int a=arr1.length;
        int b=arr2.length;

        int n=a+b;

        int arr3[]=new int[n];
        int count=0;
        for(int i:arr1)
        {
            arr3[count]=i;
            count++;
        }
       // count=1;
       for(int i:arr2)
       {
           arr3[count]=i;
           count++;
        }
        for (int a3:arr3)
            System.out.print(a3+" ");

        //print array
        System.out.print(Arrays.toString(arr3)+" ");

        System.out.println("MERGE BOTH ARRAY 1ST POS AND SO ON");
        for (int i = 0; i < a; i++) {
            arr3[i]=arr1[i];
        }

        for (int i = 0; i < b; i++) {
            arr3[a+i]=arr2[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr3[i]+" ");

        }
    }
}
