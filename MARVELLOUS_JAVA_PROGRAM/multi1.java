
class multi1
{
   public static void main(String arg[])
   {
      int arr[][]=new int[3][2];
      //arr is 2 dimenstional array
      //which contain 3 one dimenstional array
      //each one dinenstional array contain
      //2 element and each element is
      //of type integer
      
      arr[0][0]=10;
      arr[0][1]=20;
      arr[1][0]=30;
      arr[1][1]=40;
      arr[2][0]=50;
      arr[2][1]=60;
      
      System.out.println(arr[0][0]);
      System.out.println(arr[2][1]);
      System.out.println("ARRAY SIZE:"+arr.length);
      System.out.println(arr[2].length);
      
      for(int i=0;i<arr.length;i++)
      {
         for(int j=0;j<arr[i].length;j++)
         {
         System.out.println(arr[i][j]);
         }
      }

       // int [] marks; // A 1-D Array
        int [][] flats; // A 2-D Array
        flats = new int [2][3];
        flats[0][0] = 101;
        flats[0][1] = 102;
        flats[0][2] = 103;
        flats[1][0] = 201;
        flats[1][1] = 202;
        flats[1][2] = 203;

        // Displaying the 2-D Array (for loop)
        System.out.println(flats.length);

        for(int i=0;i<flats.length;i++)
        {
            for(int j=0;j<flats[i].length;j++) 
            {
                System.out.print(flats[i][j]);
                System.out.print(" ");
            }
            System.out.println("");
        }

    }
   }

