package ArrayPractice;

public class ReverseArray {
    public static void main(String[] args) {
        int [] arr=RandomArray.randomArr1(4);
        System.out.println("ORIGNAL ARRAY");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("REVERSE ARRAY");
        for (int i =arr.length-1; i>=0; i--) {

            System.out.print(arr[i]+" ");
        }
    }
}
