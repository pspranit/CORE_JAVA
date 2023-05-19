import java.util.Scanner;
class ArrayDemo4
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("TOTAL NO.OF COURSE");
		int size=sc.nextInt();

		double marks[]=new double[size];
		System.out.println("ENTER MARKS");

		for(int a=0;a<size;a++)
		{
			marks[a]=sc.nextDouble();
		}

		double totalMarks=0.0;
		for(int a=0;a<size;a++)
		{
			//totalMarks+=marks[a];
			totalMarks=totalMarks+marks[a];
		}

		System.out.println("TOTAL MARKS :"+totalMarks);
		System.out.println("PERCENTAGE :"+(totalMarks)/size);
	}
}