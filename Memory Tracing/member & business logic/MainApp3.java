import java.util.Scanner;

class Circle
{
	static double pi=3.14;

	void area(double radius)
	{
		double result=pi*radius*radius;
		System.out.println("AREA OF CIRCLE:"+radius);
	}

	void circumference(double radius)
	{
		double result=2*pi*radius;
		System.out.println("circumference:"+result);
	}
}
class MainApp3
{
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER RADIUS");
		double rad=sc.nextDouble();
		System.out.println("SELECT OPERATIONS:");
		System.out.println("1.AREA OF CIRCLE:");
		System.out.println("2.CIRCUMFERENCE:");

		double choice=sc.nextDouble();

		if(choice==1)
		{
			new Circle().area(rad);
		}

		else if(choice==2)
		{
			new Circle().circumference(rad);
		}

		else
		{
			System.out.println("INVALID CHOICE");
		}
	}
}