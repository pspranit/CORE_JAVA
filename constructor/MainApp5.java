class Registration
{
	String userName;
	int contact;
	String emailId;
	String address;

	Registration(String userName2,int contact2,String emailId2)
	{
		userName=userName2;
		contact=contact2;
		emailId=emailId2;
	}

	Registration(String userName2,int contact2,String emailId2,String address2)
	{
		userName=userName2;
		contact=contact2;
		emailId=emailId2;
		address=address2;
	}

	void displayDetails()
	{

		System.out.println(userName);
		System.out.println(contact);
		System.out.println(emailId);
		System.out.println(address);
		System.out.println();
	}
}

class MainApp5
{
	public static void main(String[] args) {
		
		Registration r1=new Registration("ADMIN",123456,"AD@GMAIL.COM");
		r1.displayDetails();

		Registration r2=new Registration("ADMIN2",000000,"PS@GMAI.COM","NASHIK");
		r1.displayDetails();
	}
}