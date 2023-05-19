import java.util.Scanner;
class OperatorDemo2
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER THE NUMBER");

		int no=sc.nextInt();

		String result=(no%2==0)?"EVEN":"ODD";
		System.out.println("NUMBER IS :=> "+result);
	}
}