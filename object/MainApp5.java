class Qspiders
{
	String className="QSPIDERS";
	String address="HADPASAR";
	long cont_No=1234567890l;

	void addmistion()
	{
		System.out.println("ADDMISTION OPEN");
	}

	void teaching()
	{
		System.out.println("JAVA,SQL,WEB TECH");
	}
}

class MainApp5
{
	public static void main(String[] args) {

		Qspiders q=new Qspiders();
		System.out.println("CLASS NAME :=>"+q.className);
		System.out.println("ADDRESS :=>"+q.address);
		System.out.println("CONTACT NUMBER :=>"+q.cont_No);

		q.addmistion();
		q.teaching();
		

	}
}