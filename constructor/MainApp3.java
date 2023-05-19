import java.util.Scanner;

class Laptop
{
	double price;
	String company;
	String color;

	Laptop(double price2,String company2,String color2)
	{
		price=price2;
		company=company2;
		color=color2;
		//displayDetails();
	}

	void displayDetails()
	{
		System.out.println(price+"\t"+company+"\t"+color);
	}
}

class MainApp3
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("ENTER PRICE:=> ");
		double price=sc.nextDouble();

		System.out.println("ENTER COMPANY NAME:=> ");
		String company=sc.next();

		System.out.println("ENTER COLOR:=> ");
		String color=sc.next();

		Laptop l=new Laptop(price,company,color);
		l.displayDetails();
	}
}