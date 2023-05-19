import java.util.Scanner;

class ControlDemo3
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter first no1");
		double n1=sc.nextDouble();
		System.out.println("enter second no2");
		double n2=sc.nextDouble();

		LargestNumber(n1,n2);
	}

	static void LargestNumber(double no1,double no2)
	{
		if(no1<no2)
		{
			System.out.println("LARGE NO NO2");
		}
		else if(no1>no2)
		{
			System.out.println("LARGER NO NO1");
		}

		else if(no1==no2)
		{
			System.out.println("EQUAL NO");
		}
	}
}