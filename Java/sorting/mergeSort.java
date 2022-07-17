class mergeSortalgorithm
{
	public static void main(String args[])
	{
		int arr[] = {6,5,4,3,9,7,8};
		mergeSort(arr,0,arr.length-1);
		for(int x:arr)
			System.out.print(x+"\t");
	}
	
	public static void mergeSort(int arr[], int low, int high)
	{
		if(low<high)
		{
			int mid = low + (high-low)/2;
			
			mergeSort(arr,low,mid);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	
	public static void merge(int arr[], int low, int mid, int high)
	{
		int n1 = mid-low+1, n2 = high-mid;
		int arr1[] = new int[n1];
		int arr2[] = new int[n2];
		
		for(int i=0;i<arr1.length;i++)
			arr1[i]=arr[low+i];
		for(int j=0;j<arr2.length;j++)
			arr2[j]=arr[mid+1+j];
			
		int i=0,j=0,k=low;
		while(i<n1 && j<n2)
		{
			if(arr1[i]<=arr2[j])
			{
				arr[k]=arr1[i];
				i++;k++;
			}	
			else
			{
				arr[k]=arr2[j];
				j++;k++;
			}	
		}
		while(i<n1)
		{
			arr[k]=arr1[i];
			i++;k++;
		}
		while(j<n2)
		{
			arr[k]=arr2[j];
			j++;k++;
		}
	}
}
