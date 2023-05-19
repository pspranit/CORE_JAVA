package ArrayPractice;

class ArrayMerge {
    int[] merge(int arr[], int brr[], int arrSize, int brrSize) {
        int crr[] = new int[arrSize + brrSize];

        int no = 0;
        for (int i = 0; i < arr.length; i++) {
            crr[no] = arr[i];
            no++;
        }
        for (int i = 0; i < brr.length; i++) {
            crr[no] = brr[i];
            no++;
        }
        return crr;
    }
}
public class MergeTwoArray {
    public static void main(String[] args) {

        int[]arr={10,20,30,40};
        int []brr={100,200,300,400};

        int arrSize= arr.length;
        int brrSize=brr.length;
     ArrayMerge a=new ArrayMerge();

     int crr[]=a.merge(arr,brr,arrSize,brrSize);

        for (int i = 0; i < crr.length; i++) {
            System.out.print(crr[i]+" ");
        }
    }
}
