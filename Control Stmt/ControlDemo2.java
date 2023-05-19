import java.util.Scanner;

class ControlDemo2
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("enter PRICE");
		double price=sc.nextDouble();
		System.out.println("enter QTY");
		double qty=sc.nextDouble();

		totalAmount(price,qty);
	}

	static void totalAmount(double p,double q)
	{
		double total=p*q;
		double amt=0.0;

		if(total<=500)
		{
			amt=total-total*0.05;
			//System.out.println("DISCOUNT 5%:")
		}
		else if(total<=1000)
		{
			amt=total-total*0.1;
		}
		else if(total>=1000)
		{
			amt=total-total*0.15;
		}
		System.out.println("TOTAL AMT:"+total);
		System.out.println("DISCOUNT AMT:"+amt);
	}
}