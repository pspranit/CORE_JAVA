class OperatorDemo
{
	public static void main(String[] args) {
		
		// int a=36;
		// int b=25;
		// int c=85;

		// System.out.println(a>b && b<c);		//true

		// System.out.println(c<a || b>a);		//false

		// System.out.println((a>c || c<b) && a>b);	//false

		// System.out.println((c<a && b<a)||(b>a && a<c)); //false

		// System.out.println(!(c>a));		//false

		// System.out.println(!(a>b && b>c));	//true

//////////////////////////////////////////////////////////////////

		// int a=4;
		// int b=6;

		// b=++a + ++b +a;

		// if(a++>6 || --b<20)
		// {
		// 	a++;
		// 	System.out.println(a);
		// 	System.out.println(b);
		// }
		// else{
		// 	b--;
		// }

/////////////////////////////////////////////////////////////////////

		int x=4;
		int y=3;

		if((++x > 5 && --y<3) || (x++ > 5 && y--<3))
		{
			x++;
			y++;
			System.out.println(x);
			System.out.println(y);
		}
		else{
			x--;
			y--;
			System.out.println(x);
			System.out.println(y);
		}
	}
}