class Demo
{
	static int a=10;

	static void test()
	{
		System.out.println("test");
	}
}

class MainApp1
{
	public static void main(String[] args) {
	System.out.println("value of a:"+Demo.a);
	Demo.test();	
	}
}