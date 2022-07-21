class mergeArrays
{
    public static void main(String args1[])
    {
        int arr1[] = {1,3,5,7};
        int arr2[] = {2,4,6};
        int arr3[] = new int[arr1.length+arr2.length];
//        for(int i=0;i<args1.length;i++)
//            arr1[i]=Integer.parseInt(args1[i]);
//        for(int i=0;i<args2.length;i++)
//            arr2[i]=Integer.parseInt(args2[i]);
        
        arr3 = merge(arr1,arr2);
        
        for(int x : arr3)
            System.out.print(x+"\t");
    }
    public static int[] merge(int arr1[], int arr2[])
    {
        int n=arr1.length+arr2.length;
        int arr3[] = new int[n];
        int i=0,j=0,k=0;
        for(int l=0;l<arr1.length;l++)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k]=arr1[i];
                k++;i++;
            }
            else
            {
                arr3[k]=arr2[j];
                k++;j++;
            }
        }
        for(int l=0;l<arr2.length;l++)
        {
            if(arr1[i]<arr2[j])
            {
                arr3[k]=arr1[i];
                k++;i++;
            }
            else
            {
                arr3[k]=arr2[j];
                k++;j++;
            }
        }
        return arr3;
    }
}
