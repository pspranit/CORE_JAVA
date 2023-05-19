package ArrayPractice;

public class TempArrayReverse {
    public static void main(String[] args) {

        //int arr[]=RandomArray.randomArr(5);
        int arr[]={2,3,1,4,6,7,8};
        int n= arr.length;
        for(int a:arr)
        {
            System.out.print(a+" ");
        }

        int [] temp=new int[n];
        int tempVar=n;

        for (int i = 0; i < arr.length; i++) {
           temp [tempVar-1]=arr[i];
           tempVar=tempVar-1;
        }
        System.out.println();
        System.out.println("REVERSE ARRAY");
        for (int b:temp)
        {
            System.out.print(b+" ");
        }
    }
}
