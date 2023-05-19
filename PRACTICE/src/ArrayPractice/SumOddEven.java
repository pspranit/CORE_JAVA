package ArrayPractice;

public class SumOddEven {
    public static void main(String[] args) {

        int arr[]={1,2,3,5,6,7,8};
        int sum=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]%2==0)
            {
                sum+=1;
            } else if (arr[i]==5) {
                sum+=3;
            }
            else if(arr[i]%2!=0)
            {
                sum+=3;
            }
        }
        System.out.println(sum);

    }
}
