import java.util.Scanner;

public class RevNum {
    public static void main(String[] args) {
        int num;
        int rev=0;
        int ps=0;
        System.out.println("Orignal Number");
        Scanner s=new Scanner(System.in);
        num=s.nextInt();
        while(num!=0)
        {
            ps=num%10;
            rev=rev*10+ps;
            num=num/10;
        }
        System.out.println("reversed Number\n"+rev);
    }
}
