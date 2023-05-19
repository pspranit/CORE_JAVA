class SwatikaPattern
{
    static void swastika(int row, int col)
    {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++)
            {
                if (i < row / 2)        // i < 3
                {

                    if (j < col / 2)        // j < 3
                    {

                        if (j == 0)
                            System.out.print("*");

                        else
                            System.out.print(" "+ " ");
                    }

                    else if (j == col / 2)
                        System.out.print(" *");

                    else
                    {
                        if (i == 0)
                            System.out.print(" *");
                    }
                }
                else if (i == row / 2)
                    System.out.print("* ");
                else
                {


                    if (j == col / 2 || j == col - 1)
                        System.out.print("* ");

                    else if (i == row - 1)
                    {


                        if (j <= col / 2 || j == col - 1)
                            System.out.print("* ");
                        else
                            System.out.print(" "+ " ");
                    }
                    else
                        System.out.print(" "+" ");
                }
            }
            System.out.print("\n");
        }
    }

    public static void main (String[] args)
    {

        int row =5, col = 5;

        swastika(row, col);
    }
}

