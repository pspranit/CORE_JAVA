package ArrayPractice;


public class SecondMax {

    public static void main(String[] args) {

        int[] brr = {10, 30, 10, 5, 6, 2};

        int size=brr.length;
        for (int i = 0; i < brr.length; i++) {

            for (int j = 0; j < brr.length -1-i; j++)
            {
                if (brr[j] > brr[j + 1])
                {
                    int temp = brr[j];
                    brr[j] = brr[j + 1];
                    brr[j + 1] = temp;
                }
            }
        }
        System.out.println(brr[size-2]);

    }
}
