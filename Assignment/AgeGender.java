import java.util.Scanner;

class FinalAgeGender
{
	void ageGender(int age,int gender)
	{
		if(gender==1)
		{
			System.out.println("SHE WILL WORK ONLY IN URBAN AREA");
		}

		if (gender==2)
		{
			 if(age>20 && age<40)
			{
				System.out.println("WORK IN ANYWHERE");
			}

			 else if(age>40 && age<60)
			{
				System.out.println("WORK IN URBAN AREA ONLY");
			}

				else
				{
					System.out.println("ERROR");
				}
		}
			
	}
}
	


class AgeGender
{
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);

		System.out.println("1:ENTER THE AGE");
		int age=sc.nextInt();

		System.out.println("2:ENTER THE GENDER");
		int gender=sc.nextInt();


		FinalAgeGender f=new FinalAgeGender();

		f.ageGender(age,gender);
	}
}