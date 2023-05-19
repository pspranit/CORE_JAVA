package ArrayPractice;

public class CopyArray {

    public static void main(String[] args) {

        int arr[]={1,2,3,4,5,10};
        int arr1[] =new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
        }

        //arr1=arr.clone();

        for(int a:arr)
        {
            System.out.print(a+" ");
        }
        System.out.println();
        System.out.println("COPY ARRAY");

        for(int j=0;j<arr1.length;j++)
        {
            System.out.print(arr1[j]+" ");
        }
    }
}
