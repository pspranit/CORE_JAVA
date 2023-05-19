class MethodDemo4{

	static void areaTriangle(double b,double h)
	{
		double area=0.5*b*h;
		System.out.println("AREA OF TRIANGLE:"+area);
	}

	static void areaCircle(double r)
	{
		double aCircle=3.14*r*r;
		System.out.println("AREA OF CIRCLE:"+aCircle);
	}

	public static void main(String[] args) {
		areaTriangle(10,5);
		areaCircle(20.5);
	}
}