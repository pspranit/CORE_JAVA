import java.util.Scanner;

public class StarDollerPattern {

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("ENTER LINE");
        int no=scanner.nextInt();

        int no2=no/2;
        int no3=no/2;
        int space=0;
        for (int i = 0; i < no; i++)
        {
           //first no2=no/2 iterations
            for (int j = 0; j < no2; j++) {
                
                if(i % 4 ==0 || i % 4 == 1)
                {
                    System.out.print("*");
                } else {
                    System.out.print("$");
                }
            }
            //space
            for (int s = 0; s < space; s++) {
                System.out.print(" ");
            }

            //second no3=no/2 iterations
            for (int j = 0; j < no3; j++)
            {
                if(i % 4 ==0 || i % 4 == 1)
                {
                    System.out.print("*");
                }
                else {
                    System.out.print("$");
                }
            }

            no2--;
            no3--;
            space+=2;
            System.out.println();

        }
    }
}
