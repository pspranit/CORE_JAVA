class Jagged2
{
	public static void main(String arg[])
	{
	int a[]={1,2,3,4};
	int b[]={2,4,6,8};
	int c[]={5,6,7,8};
	
	int arr[][]={
				{1,2,3,4},
				{2,4,8},
				{5,6,7,8}
				};
		
		int i=0,j=0;
		
		for(i=0;i<arr.length;i++)
		{
			for(j=0;j<arr[i].length;j++)
			{
			System.out.println(" " + arr[i][j]);
			}
			System.out.println();
		}
		
		}
	}

