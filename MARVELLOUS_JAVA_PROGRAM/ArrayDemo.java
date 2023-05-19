class ArrayDemo
{
	public static void main(String arg[])
	{
		int arr[] = new int [5];	// First way
		arr[0] = 11;
		arr[1] = 21;
		arr[2] = 51;
		arr[3] = 101;
		arr[4] = 111;

		System.out.println("Length of array is "+arr.length);
		//int brr[]={11,21,51,101,111};	// Second way
		//int crr[] = new int[]{11,21,51,101,111};	// Third way
		
		System.out.println("FOR LOOP");
		for(int icnt = 0; icnt < arr.length; icnt++)
		{
			System.out.println(arr[icnt]);
		}
		
		System.out.println("WHILE LOOP");
		int i = 0;
		while(i < arr.length)
		{
			System.out.println(arr[i]);
			i++;
		}
		
		System.out.println("DO WHILE");
		int j = 0;
		do
		{
			System.out.println(arr[j]);
			j++;
		}while(j < arr.length);

		System.out.println("FOR EACH");
		for(int no : arr)
		{
			System.out.println(no);
		}
	}
}