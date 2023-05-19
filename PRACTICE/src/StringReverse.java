import java.util.Scanner;

public class StringReverse {
    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        String str=sc.nextLine();
        int size1=1;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                size1++;
            }
        }

        String arr[]=new String[size1];
        for(int i=0;i<arr.length;i++){
        }

        for(String a: arr){
            System.out.println(a);
        }

    }
}
