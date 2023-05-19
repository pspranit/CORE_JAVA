package ArrayPractice;


public class MinMaxElement {
    public static void main(String[] args) {

        int[] arr = {10, 20, 5, 6, 2, 100};

        int min = arr[0];
        int max = arr[0];

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }

                else if (arr[i] > max) {
                    max = arr[i];
                }
            }
            System.out.println(min);
            System.out.println(max);

        }
}
