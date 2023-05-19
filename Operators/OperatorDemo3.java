import java.util.Scanner;
class OperatorDemo3
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("1:JAVA");
		System.out.println("2:J2EE");
		System.out.println("3:SQL");
		System.out.println("ENTER THE CHOICE");
		int choice=sc.nextInt();

		String result=(choice==1)?"JAVA":(choice==2)?"J2EE":(choice==3)?"SQL":"INVALID";
		System.out.println("YOUR SELECT COURSE IS :=>"+result);
	}
}