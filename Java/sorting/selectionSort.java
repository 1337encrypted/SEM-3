class selectionSort
{
	public static void main(String args[])
	{
		int a[] = new int[args.length];
		for(int i=0;i<args.length;i++)
			a[i] = Integer.parseInt(args[i]);
		long startTime = System.currentTimeMillis();
		int low;
		for(int k=0;k<1000000;k++)			//delay loops in milliseconds
		for(int i=0;i<a.length-1;i++)
		{
			low = i;
			for(int j=i+1;j<a.length-2;j++)
			{
				if(a[j]<a[low])
					low = j;
			}
			int temp = a[i];
			a[i]=a[low];
			a[low]=temp;
		}
		long endTime = System.currentTimeMillis();
		long duration = endTime-startTime;		//duration of the basic operation
		System.out.println("\nSorted array:");
		for(int i=0;i<a.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println("\n\nCPU execution time: "+duration+" ms");
		System.out.println("Time complexity: theta(n^2)");
	}
}
