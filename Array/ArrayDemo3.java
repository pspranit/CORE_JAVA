import java.util.Scanner;
class ArrayDemo3
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("ENTER TOTAL NO.OF COURSE");
		int size=sc.nextInt();

		String[] course=new String[size];
		System.out.println("ENTER COURSE");

		for(int a=0;a<size;a++)
		{
			course[a]=sc.next();
		}

		System.out.println("SELECTED COURSE");

		for(int a=0;a<size;a++)
		{
			System.out.println(course[a]);
		}
	}
}