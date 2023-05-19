public class ForLoopDemo2 {
    public static void main(String[] args) {

        int lines=5;
        int star=1;

        int row=5;
        int col=5;

        System.out.println("\t"+"(1)");

        for (int row1=1;row1<=lines;row1++)
        {
            for(int j=1;j<=row1;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
            star++;
        }
        System.out.println("\t"+"(2)");
////////////////////////////////////////////////////////////////////////////
        for(int i=1;i<=row;i++)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
        System.out.println("\t"+"(3)");
        System.out.println();

/////////////////////////////////////////////////////////////////////////////
        for (int i=row;i>=1;i--)
        {
            for (int j=1;j<=i;j++)
            {
                System.out.print("*"+" ");
            }
            System.out.println();
        }
    }
}


