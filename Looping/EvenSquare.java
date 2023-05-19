import java.util.Scanner;

public class EvenSquare {

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("ENTER START POSITION");
        int start=sc.nextInt();

        System.out.println("ENTER END POSITION");
        int end=sc.nextInt();
        int position=1;

        for (int i=start;i<=end;i++)
        {
            if(i%2==0)
            {
                int square=i*i;
                System.out.println(position+"="+square);
            }
            position++;
        }
    }
}
