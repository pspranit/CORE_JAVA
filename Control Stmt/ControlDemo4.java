import java.util.Scanner;			
class ControlDemo4
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTR THE NUMBER:");
		int i=sc.nextInt();

		evenOdd(i);
	}

	static void evenOdd(int n)
	{

		 if(n%2==0)
		{
			System.out.println("NUMBER IS EVEN:");
			
		 if(n>=0)
		{
			System.out.println("NUMBER IS POSITIVE");
			double sqrt=n*n;
			System.out.println("SQUARE ROOT:"+sqrt);
		}
		else
		{
		System.out.println("NUMBER IS NAGATIVE");
	}

	}

		else
		{
			System.out.println("NUMBER IS ODD:");

		}
	}

	}
