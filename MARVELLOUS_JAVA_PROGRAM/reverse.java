import java.util.Scanner;

class reverse{
    public static void main(String[]arg){
        Scanner s=new Scanner(System.in);
        System.out.println("Enter number");
        int num=s.nextInt();
        
        while(num!=0)
        {
            int num1=num%10;
            rnum=rnum*10+num1;
            num=num/10;
        }

    }
}