class MainApp1
{
	static int k=10;
	int j=20;

	static void test()
	{
		System.out.println("TEST METHOD");
	}

	void display()
	{
		System.out.println("DISPLAY METHOD");
	}

	public static void main(String []args)
	{
		System.out.println("MAIN METHOD STARTED");
		System.out.println("K VALUE IS:"+k);
		test();

		MainApp1 m=new MainApp1();
		System.out.println("J VALUE IS:"+m.j);

		m.display();
		System.out.println("MAIN METHOD ENDED");
	}

	}
