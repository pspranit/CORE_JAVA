import java.util.Scanner;

class FinalAttends
{
	void claculationAttends(double totalAttend,double attend)
	{
		double percentage=attend/totalAttend*100;
		System.out.println("PERCENTAGE IS :=>"+percentage);

		String result=(percentage>80)?"ATTENDED":"NOT ATTENDED";
		System.out.println(result);
	}
}
class StudAttendMock
{
	public static void main(String[] args) {
	
		Scanner sc=new Scanner(System.in);
		System.out.println("NUMBER OF CLASS HELD");
		double held=sc.nextDouble();

		System.out.println("NUMBER OF CLASSES ATTENDED");
		double attend=sc.nextDouble();

		FinalAttends f=new FinalAttends();

		f.claculationAttends(held,attend);

	}
}