import java.util.Scanner;
class TotalBill
	{
		static double commercialUnit=5.25;
		static double residentialUnit=4.25;

		void commercial(double current,double previous)
		{
			double totalAmt=current-previous;
			double billAmt=totalAmt*commercialUnit;

			System.out.println("COMMERCIAL UNIT"+billAmt);
		}

		void residential(double current,double previous)
		{
			double totalAmt=current-previous;
			double billAmt=totalAmt*residentialUnit;

			System.out.println("residentialUnit"+billAmt);
		}
	}

class MainApp4
{
	public static void main(String[] args) {

		Scanner sc =new Scanner(System.in);
		System.out.println("ENTER CURRENT READING:");
		double current=sc.nextDouble();

		System.out.println("ENTER PREVIOUS READING:");
		double previous=sc.nextDouble();

		System.out.println("PROVIDE OPTION\n1.COMMERCIAL\n2.residential");
		double choice=sc.nextDouble();

		//TotalBill t=new TotalBill();

		if(choice==1)
		{
			new TotalBill().commercial(current,previous);
		}

		else if(choice==2)
		{
			new TotalBill().residential(current,previous);
		}

		else
		{
			System.out.println("INVALID CHOICE");
		
		}
	}
	}

	
