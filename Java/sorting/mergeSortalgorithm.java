class mergeSortalgorithm
{
	public static void main(String args[])
	{
		int arr[] = {6,5,4,3,5,6,7,8};
		mergeSort(arr,0,arr.length);
		for(int x : arr)
			System.out.print(x+"\t");
	}
	
	public static int[] mergeSort(int arr[], int low, int high)
	{
		if(low < high)
		{
			//int mid = low + (high-low)/2;
			int mid = (low+high);
			mergeSort(arr,low,high);
			mergeSort(arr,mid+1,high);
			merge(arr,low,mid,high);
		}
	}
	
	public static void merge(int arr[], int low, int mid, int high)
	{
		int arr1[] = new int[arr.length];
		//int arr2[] = new int[high-mid+1];
		
		//for(int i=0;i<arr1.length;i++)
		//	arr1[i]=arr[low+i];
		//for(int j=0;j<arr2.length;j++)
		//	arr2[j]=arr[mid+1+j];
		
			
		int i=0,j=0,k=low;
		while(i<mid && j<high)
		{
			if(arr[i]<=arr[j])
			{
				arr1[k]=arr[i];
				i++;
				k++;
			}	
			else
			{
				arr1[k]=arr[j];
				j++;
				k++;
			}	
		}
		while(i<mid)
		{
			arr1[k]=arr[i];
			i++;
			k++;
		}
		while(j<high)
		{
			arr1[k]=arr[j];
			j++;
			k++;
		}
	}
}
