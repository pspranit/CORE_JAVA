class Master
{
	static int a=20;
	int b=40;
}

class MainApp2
{
	static double d=25.36;

	public static void main(String[] args) {

		System.out.println("PROGRAM STARTED");
		System.out.println("D VALUE:"+d);

		System.out.println("A VALUE IS :"+Master.a);
		System.out.println("B VALUE IS:"+new Master().b);

	}
}