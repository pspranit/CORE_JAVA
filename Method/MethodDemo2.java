class MethodDemo2
{
	public static void main(String[] args) {
		
		System.out.println("MAIN METHOD");

		createaccount();  //METHOD CALL
		createaccount();
	}

	public static void createaccount()		//METHOD DECLARATION
	{
		System.out.println("ACCOUNT CREATED");
		createprofile();							//METHOD DEFINATION
	}

	public static void createprofile()
	{
		System.out.println("PROFILE CREATED");
	}
}