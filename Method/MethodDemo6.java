class MethodDemo6{

	static void convertKMtoM(double k)
	{
		double convert=1000*k;
		System.out.println("convert KM to M:"+convert);
	}

	static void convertMtoKM(double m)
	{
		double convert=m/1000;
		System.out.println("convert M to KM:"+convert);
	}
	public static void main(String[] args) {
		
		convertKMtoM(5);
		convertMtoKM(1500);
	}
}