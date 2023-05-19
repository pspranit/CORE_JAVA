package ArrayPractice;

public class SumArray {
    public static void main(String[] args) {


        int [] arr=RandomArray.randomArr(5);
        int sum=0;
       for(int a:arr)
       {
           System.out.print(a+" ");
       }

        for (int i = 0; i < arr.length; i++) {
            sum=sum+arr[i];
        }
        System.out.println();
        System.out.println("SUM OF ARRAY "+sum);
    }
}
