
class battery
{
	int status=25;

	void charging(int charge)
	{
		status=status+charge;
	}

	void discharging(int discharge)
	{
		status=status-discharge;
	}

	void displayStatus()
	{
		if(status>15)
		{
			if(status<=100)
			{
				System.out.println("CURRENT STATUS: "+status);
				System.out.println("BATTERY IS CHARGED");
			}
			else
			{
				System.out.println("BATTERY IS FULL");
			}
		}

			else if(status>0)
			{
				System.out.println("CURRENT STATUS :"+status);
				System.out.println("BATTERY LOW");
			}
			else
			{
				System.out.println("MOBILE IS SWITCHED OFF");
			}
		}
	}

	class MainApp3
	{
	public static void main(String[] args)
	  {

	 	battery b1=new battery();

	 	b1.charging(35);
	 	b1.displayStatus();//60

	 	b1.discharging(25);
	 	b1.displayStatus();//35

	 	b1.discharging(30);
	 	b1.displayStatus();//5

	 	b1.discharging(20);
	 	b1.displayStatus();//SWITCHED OFF

	 	b1.charging(100);
	 	b1.displayStatus();//85
	 }
}