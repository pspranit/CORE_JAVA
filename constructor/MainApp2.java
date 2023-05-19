class Student
{
	int studId;
	String studName;
	double studPercentage;

	//CONSTRUCTOR
	Student(int id,String name,double percent)
	{
		studId=id;
		studName=name;
		studPercentage=percent;
		//displayDetails();
	}

	void displayDetails()
	{
		System.out.println(studId+"\t"+studName+"\t"+studPercentage);
	}
}

class MainApp2
{
	public static void main(String[] args) {
		
		Student s1=new Student(100,"PRANIT",77.80);
		s1.displayDetails();

		Student s2=new Student(101,"SHUBHAM",80.80);
		s2.displayDetails();
	}
}