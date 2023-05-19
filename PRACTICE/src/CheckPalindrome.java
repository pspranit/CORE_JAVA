import java.util.Scanner;

public class CheckPalindrome {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("CHECK STRING IS PALINDROME OR NOT");
        String str= scanner.nextLine();

        checkPalindrome(str);

    }

    private static void checkPalindrome(String str) {

        String str1=str;
        boolean status=true;

        char [] arr=str.toCharArray();
        for (int i = arr.length-1; i >=0; i--) {

            if(!(arr[i]==arr[i]))
            {
                status=false;
            }
            else {
                status=true;
            }
        }
        if(status)
        {
            System.out.println("STRING IS PALINDROME");
        }
        else{
            System.out.println("STRING IS NOT PALINDROME");
        }
    }
}
