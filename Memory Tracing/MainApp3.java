class Central
{
	static int a=20;
	int b=50;
}

class MainApp3
{
	public static void main(String[] args) {
		
		Central c=new Central();
		System.out.println("A VALUE IS:"+Central.a);	//20
		System.out.println("B VALUE IS:"+c.b);			//50

		Central.a=100;
		c.b=200;

		System.out.println("A VALUE IS:"+Central.a);	//100
		System.out.println("B VALUE IS:"+c.b);			//200

		Central c1=new Central();
		System.out.println("A VALUE IS:"+Central.a);	//100
		System.out.println("B VALUE IS:"+c1.b);			//50


	}
}