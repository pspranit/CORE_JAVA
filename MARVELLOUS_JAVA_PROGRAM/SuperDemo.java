
 class SuperDemo
 {
	 public static void main(String Arg[])
	 {
		Derived dobj=new Derived();
		dobj.gun();
		
	 }
	 }
	 
	 class Base
	 {
		public int x,y;
		public Base(int a,int b)
		{
			System.out.println("Base Constructor");
			this.x=a;
			this.y=b;
		}
		public void fun()
		{
			System.out.println("Base fun");
		}
		}
		class Derived extends Base
		{
			public int a,b;
			public Derived()
			{
				super(11,21);
				System.out.println("Derived Constructor");
			}
		public void gun()
		{
			System.out.println("value of x:"+super.x);
			super.fun();
		}
		}
			

