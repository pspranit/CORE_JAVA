class Virtual
 {
	 public static void main(String Arg[])
	 {
	 Base bp=new Derived();
	 bp.fun();
	 bp.gun();
	 bp.sun();
	 }
}	
	 
	class Base
	 {
		public void fun()
		{
		System.out.println("Base fun");
	 }
		public void gun()
		{
		System.out.println("Base gun");
   }
   }
		
	class Derived extends Base
		{
			public void fun()
			{
				System.out.println("Derived fun");
			}
			
		}
	

