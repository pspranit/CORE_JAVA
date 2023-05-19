class MethodDemo8
{
	static double calculateSalary(double basic,double hra)
	{
		double salAmt=basic+hra;
		return salAmt;
	}

	static void increSal()
	{
		double salAmt=calculateSalary(10000,5000);
		double increSal=salAmt+salAmt*0.25;
		System.out.println("LATEST SALARY:"+increSal);
	}

	public static void main(String[] args) {
		increSal();
	}
}