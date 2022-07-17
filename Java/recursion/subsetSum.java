import java.util.Scanner;
public class subsetSum
{
	public static void main(String args[])
	{
		int arr[] = new int[args.length];
		for(int i=0;i<args.length;i++)
			arr[i]=Integer.parseInt(args[i]);
		System.out.println("\nEnter the subset sum required: ");
		Scanner in = new Scanner(System.in);
		sum = in.nextInt();
		System.out.println(subSet(arr,sum));
	}
	public static int subSet(int arr[], int sum, int low, int high)
	{
		if(sum == 0)
			return 1;	
		len = arr.length;
		int total=0;
		while(len!=0)
		{
			total+=arr[len];
			--len
		}
		if(sum == total)
			return 
		int mid = low + (high-low)/2;
		subSet(arr,sum,low,mid);
		subSet(arr,sum,mid+1,high);
	}
}
