import java.util.Scanner;

public class SumEven {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER START POSITION");
        int start=sc.nextInt();

        System.out.println("ENTER END POSITION");
        int end=sc.nextInt();

        for (int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                  int sum=i+i;
                System.out.println(sum);
            }
        }
    }
}
