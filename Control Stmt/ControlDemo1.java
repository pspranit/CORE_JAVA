import java.util.Scanner;

class ControlDemo1
{
	public static void main(String[] args)
	{
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter age");
		int age=sc.nextInt();

			validation(age);
		}

		static void validation(int age)
		{
			if(age>=18)
			{
				System.out.println("Voting valid");
			}

		else
		{
			System.out.println("Voting invalid");
		}
	}
}
