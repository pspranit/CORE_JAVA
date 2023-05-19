class UOperatorDemo4
{
	public static void main(String[] args) {
		
		example1();
		example2();
		example3();
		example4();
		example5();
		example6();
		example7();
		example8();
		example9();
		example10();

	}

		static void example1()
		{
		int a=4;
		int b;

		b=a++;
		System.out.println("EXAMPLE 1 :");
		System.out.println(a); //5
		System.out.println(b); //4
		System.out.println();
	}

/////////////////////////////////////////////////////////////////////

		static void example2()
		{
		int x=7;
		int y;

		y=--x;
		System.out.println("EXAMPLE 2 :");
		System.out.println(x);	//6
		System.out.println(y);	//6
		System.out.println();
	}

///////////////////////////////////////////////////////////////////////
		static void example3()
		{
		int p=4;
		int q;

		q=++p+p+p++;
		System.out.println("EXAMPLE 3 :");
		System.out.println(p); //6
		System.out.println(q); //15
		System.out.println();
	}

///////////////////////////////////////////////////////////////////////
		static void example4()
		{
		int j=7;
		int k;

		k=--j+j+ ++j+ j++; 
		System.out.println("EXAMPLE 4 :");
		System.out.println(j); //8
		System.out.println(k); //26
		System.out.println();
	}

//////////////////////////////////////////////////////////////////////
		static void example5()
		{
		int a=10;
		int b=4;

		b=a++ + --b +a+b+ --a; 
		System.out.println("EXAMPLE 5 :");
		System.out.println(a);	//10
		System.out.println(b);	//37
		System.out.println();
	}

//////////////////////////////////////////////////////////////////////
		static void example6()
		{
		int x=8;
		int y=4;

		y=x++ + --x + ++x +y +--y;
		System.out.println("EXAMPLE 6 :");
		System.out.println(x);
		System.out.println(y);
		System.out.println();
	}

///////////////////////////////////////////////////////////////////////
		static void example7()
		{
		int p=5;
		int q=2;

		q=++p + p + --q;

		if(++p>6)
		{
			--q;
			System.out.println("EXAMPLE 7 :");
			System.out.println(p);
			System.out.println(q);
			System.out.println();
		}

		else{
			++q;
		}
	}

/////////////////////////////////////////////////////////////////////
		static void example8()
		{
		int p=5;
		int q=3;
		int r;

		r=++p + ++q + --p + --q + p + q;

		if(p++>4)
		{
			r++;
			q++;
			System.out.println("EXAMPLE 8 :");
			System.out.println(p);
			System.out.println(q);
			System.out.println(r);
			System.out.println();
		}
		else{
			r--;
			q--;
		}
	}

///////////////////////////////////////////////////////////////////
		static void example9()
		{
		int a=3;
		int b=2;

		b=a++ + b + --a + a-- + a + b;

		if(++b>7)
		{
			if(--a<5)
			{
				b++;
				System.out.println("EXAMPLE 9 :");
				System.out.println(a);
				System.out.println(b);
				System.out.println();
			}
		}
		else{
			a--;
		}
	}

		static void example10()
		{
			int a=71;
			int b=0;

			b=a++ + b++ + --b- --a- --b;
			System.out.println(a);
			System.out.print(b);
		
		}
}
