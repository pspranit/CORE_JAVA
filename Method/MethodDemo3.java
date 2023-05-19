class MethodDemo3
{
	static void add(double a,double b)	//PARAMETERIZED METHOD
	{
		double c=a+b;
		System.out.println("ADDITION:"+c);
	}

	public static void main(String[] args) {
		
		add (10,20.20);
		add(20.30,40.30);
	}
}