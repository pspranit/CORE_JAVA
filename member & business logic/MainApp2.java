class Sample
{
	 int a=10;

	 void test()
	{
		System.out.println("test");
	}
}

class MainApp2
{
	public static void main(String[] args) {
		
		System.out.println("value of a:"+new Sample().a);
		new Sample().test();
	}
}