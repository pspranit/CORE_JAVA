class Demo1
{
	static int a=10;

	static void test()
	{
		System.out.println("test");
	}
}

class MainApp11
{
	public static void main(String[] args) {
	System.out.println("value of a:"+Demo1.a);
	Demo1.test();
	}
}