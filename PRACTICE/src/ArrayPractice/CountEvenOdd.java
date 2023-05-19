package ArrayPractice;

public class CountEvenOdd {
    public static void main(String[] args) {

        //int arr[]={2,3,1,4,6,7,8};
        int[] arr=RandomArray.randomArr(5);
        System.out.print("RANDOM ARRAY :");
        for(int a:arr)
        {
            System.out.print(a+" ");
        }
        int cEven=0;
        int cOdd=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                cEven++;
            }
            else
            {
               cOdd++;
            }
        }
        System.out.println();
        System.out.println("EVEN ELEMENT COUNT :"+cEven);
        System.out.println("ODD ELEMENT COUNT :"+cOdd);
    }
}
