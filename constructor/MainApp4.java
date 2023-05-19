class Master
{
	//STATIC BLOCK
	static
	{
		System.out.println("STATIC BLOCK");
	}

	//CONSTRUCTOR
	Master()
	{
		System.out.println("CONSTRUCTOR");
	}

	//NON-STATIC BLOCK
	{
		System.out.println("NON-STATIC BLOCK");
	}

	//NORMAL METHOD
	void info()
	{
		System.out.println("INFO METHOD");
	}
}

class MainApp4
{
	public static void main(String[] args) {
		
		System.out.println("MAIN METHOD");
		Master m=new Master();
		//m.info();
	}
}