public class FindMaxAndMin {
    public static void main(String[] args)
        {
            String str="10,20,40,50";

            String [] arr=str.split(",");


            int brr[]=new int[arr.length];

            for (int i = 0; i < arr.length; i++) {
                brr[i]=Integer.parseInt(arr[i]);
            }

            for(int a:brr)
            {
                System.out.print(a+",");
            }

            int min=brr[0];
            int max=brr[0];

            for (int i = 0; i < brr.length; i++) {
                if(brr[i]<min)
                {
                    min=brr[i];
                }
                if(brr[i]> max)
                {
                    max=brr[i];
                }
            }
            System.out.println();
            System.out.println("MIN VALUE:"+min);
            System.out.println("MAX VALUE:"+max);
        }
    }


