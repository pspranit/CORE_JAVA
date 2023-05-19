class Mobile
{
	String company="APPLE";
	double price=40000.00;
	boolean isnfcenabled=true;
	double ramSize=8;

	void calling()
	{
		System.out.println("CALLING");
	}


	void message()
	{
		System.out.println("MESSAGE");
	}
}
class MainApp1
{
	public static void main(String[] args) {
		
		Mobile m1=new Mobile();

		System.out.println("COMPANY: "+m1.company);
		System.out.println("PRICE: "+m1.price);
		System.out.println("IS NFC ENABLED: "+m1.isnfcenabled);
		System.out.println("RAM SIZE: "+m1.ramSize+"GB");

		m1.calling();
		m1.message();
	}
}