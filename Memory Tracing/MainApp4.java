class Bike
{
	static int mainReading=0;
	 int tripReading=0;

	void calculateReading(int reading)
	{
		mainReading=mainReading+reading;
		tripReading=reading;
	}
}

class MainApp4
{
	public static void main(String[] args)
	 {
		
		Bike b1=new Bike();
		b1.calculateReading(400);
		System.out.println("MAIN READING"+Bike.mainReading);	//400
		System.out.println("TRIP READING"+b1.tripReading);		//400

		Bike b2=new Bike();
		b2.calculateReading(200);
		System.out.println("MAIN READING"+Bike.mainReading);	//400+200=600
		System.out.println("TRIP READING"+b2.tripReading);		//200


	}
}