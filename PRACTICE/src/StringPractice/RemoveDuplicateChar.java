package StringPractice;

public class RemoveDuplicateChar {

    public static void main(String[] args) {

        String str="responsibility";

        int count;
        char [] arr=str.toCharArray();

        System.out.println("char\tcount");
        System.out.println("-----------------");
        for (int i = 0; i < arr.length; i++)
        {
            count=1;

            for (int j = i+1; j < arr.length; j++) {

                if (arr[i]==arr[j] && arr[i]!=' ')
                {
                    count++;
                   arr[j]='O';
                }
            }
            if (count > 1 && arr[i] != 'O')
            {
                System.out.println(arr[i]+" : "+count);
            }
        }

    }
}
