import java.util.Scanner;

public class OddReverse {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER START POSITION");
        int start=sc.nextInt();

        System.out.println("ENTER END POSITION");
        int end=sc.nextInt();

        for(int i=end;i>=start;i--)
        {
            if(i%2!=0)
            {
                System.out.println(i);
            }
        }
    }
}
