package ArrayPractice;

import java.util.Arrays;

public class EqualArray {
    public static void main(String[] args) {

        int arr1[]={5,4,3,2,0};
        int arr2[]={1,5,3,4,2};

        int n1=arr1.length;
        int n2=arr2.length;

        if(n1==n2)
        {
            Arrays.sort(arr1);
            Arrays.sort(arr2);

            boolean status=true;
            for (int i = 0; i < arr1.length; i++) {
                if(arr1[i]!=arr2[i])
                {
                   status=false;
                   break;
                }
            }
            if(status)
            {
                System.out.println("EQUAL");
            }
            else {
                System.out.println("NOT EQUAL");
            }
        }
    }
}
