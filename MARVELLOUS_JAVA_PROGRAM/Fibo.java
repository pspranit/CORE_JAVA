import java.util.Scanner;
public class Fibo {
    public static void main(String[] args) {
        int a=0,b=1;
        //System.out.println(a+"\n"+b);
		int num;
		Scanner s=new Scanner(System.in);
		num=s.nextInt();
        int c=0;
        while(c<=num)
        {
			int i;
            i=a+b;
            System.out.println(+i);
            a=b;
            b=c;
		c++; 
		}
    }
}
