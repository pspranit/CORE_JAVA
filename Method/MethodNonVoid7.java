class MethodNonVoid
{
	//NON VOID METHOD
	static int display()
	{
		int a=10,b=20;
		int mul=a*b;
		System.out.println("DISPLAY METHOD");
		return mul;
	}
	public static void main(String[] args) 
	{
		int result=display();
		System.out.println("MULTIPLICATION:"+result);
		
	}
}