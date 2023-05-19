package ArrayPractice;

import java.util.Random;

public class RandomArray {
    public static Random rd = new Random();

    public static int[] randomArr(int n) {
        int arr[]=new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = rd.nextInt(20);

        }
        return arr;
    }

    public static int [] randomArr1(int size)
    {
        int demo[]=new int[size];

        for (int i = 0; i < demo.length; i++) {
            demo[i]= rd.nextInt(20);
        }
        return demo;
    }
}
