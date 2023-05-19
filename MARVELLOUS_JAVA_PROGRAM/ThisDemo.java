
	 
	 class Demo
	 {
		public int x,y;
	 
		public Demo()
		{
			System.out.println("Default Constructor");
		}
		public Demo(int a,int b)
		{
			this();
			System.out.println("parameterised Constructor");
			this.x=a;
			this.y=b;
		}
		public void fun()
		{
			System.out.println("Inside Fun");
			System.out.println("value of x:"+this.x);
			System.out.println("value of x:"+this.y);
		}
		public void gun()
		{
			System.out.println("Inside Gun");
			this.fun();
	 }
	 }
	 
	 class ThisDemo
	{
	 public static void main(String Arg[])
	 {
	    Demo obj=new Demo(10,20);
		obj.gun();
		obj.fun();
		}
	 }
	 
	 
		