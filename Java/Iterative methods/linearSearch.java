class linearSearch
{
	public static void main(String []args)
	{
		int arr[] = {2,3,4,5,6,7,56,8};
		int key = 6;
		if(Search(arr,key))
			System.out.println("Element found");
		else
			System.out.println("Element not found");
	}
	
	public static boolean Search(int arr[], int key)
	{
		if(arr.length == 0)
			return false;
		for(int x : arr)
			if(key == x)
				return true;
		return false;
	}
}
