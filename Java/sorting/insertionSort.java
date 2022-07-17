class insertionSort
{
	public static void main(String args[])
	{
		int a[] = new int[args.length];
		int key,j;
		for(int i=0;i<args.length;i++)
			a[i]=Integer.parseInt(args[i]);
			
		long startTime = System.currentTimeMillis();
		for(int k=0;k<1000000;k++)		//delay loops
			for(int i=1;i<a.length;i++)
			{
				key = a[i];
				j = i-1;
				while(j>=0 && a[j]>key)
				{
					a[j+1] = a[j];
					j--;
				}
				a[j+1] = key;
			}			
		long endTime = System.currentTimeMillis();
		long duration = endTime-startTime;
		
		System.out.println("Sorted array:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println("\nCPU execution time: "+duration+" ms");
		System.out.println("Time complexity: Big O(N^2)");
	}
}
