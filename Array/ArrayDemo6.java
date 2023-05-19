class ArrayDemo6
{
	public static void main(String[] args) {
		
		int [] arr1={15,30,45};
		int [] arr2={60,75,90};

		int[] sum=new int[arr1.length];

		for(int a=0;a<arr1.length;a++)
		{
			sum[a]=arr1[a]+arr2[a];
			System.out.println(sum[a]);
		}
	}
}