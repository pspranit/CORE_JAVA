class MethodDemo
{
	public static void main(String[] args) {
		System.out.println("MAIN METHOD");
		//MethodDemo d=new MethodDemo();   
		//d.display();						////NON STATIC METHOD CALL

		  display();   //METHOD CALL
	}


	public static void display()			//METHOD DECLARATION
	{
		System.out.println("DISPLAY METHOD");  //METHOD DEFINATION
	}

	//  void display()			///NON STATIC METHOD
	// {
	// 	System.out.println("DISPLAY METHOD");  
	// }
}