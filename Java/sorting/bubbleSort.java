import java.util.*;

class bubbleSort
{
	public static void main(String args[])
	{
		boolean swapped = false;
		int a[] = new int[args.length];
		for(int i=0;i<args.length;i++)
		{
			a[i]=Integer.parseInt(args[i]);
		}
			
		long startTime = System.currentTimeMillis();	//Start timer
		for(int k=0;k<1000000;k++)	
		{			//delay loops
			for(int i=0;i<a.length;i++)
			{
				swapped = false;		//swapped keeps a check on weather the array is presorted
				for(int j=0;j<a.length-i-1;j++)
				{
					if(a[j]>a[j+1])
					{
						int temp = a[j];
						a[j] = a[j+1];
						a[j+1] = temp;	
						swapped = true;
					}
				}
				if(swapped == false)
					break;
			}
		}
		long endTime = System.currentTimeMillis();	//Stop timer
		
		System.out.println("Sorted array: ");
		for(int i=0;i<args.length;i++)
			System.out.print(a[i]+"\t");
		System.out.println();
		long duration = (endTime - startTime);//1000000;  //divide by 1000000 to get milliseconds.
		System.out.println("\nCPU execution time: "+duration+" ms");
		System.out.println("Time complexity: theta(n^2)");
	}
}
