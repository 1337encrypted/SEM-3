import java.util.Random;
import java.util.Arrays;
class binarySearch
{
    public static void main(String[] args) {
        int arr[] = new int[Integer.parseInt(args[0])];
        int key = Integer.parseInt(args[1]);
        Random rand = new Random();         //Random number generator object
        for(int i=0; i<arr.length; i++)
            arr[i] = rand.nextInt(100);      //Generates random numbers less than 1000
        Arrays.sort(arr);                   //Sort the random array
//        for(int x : arr)                  //for debugging purposes
//            System.out.println(x+"\t");

        int index = binSearch(arr,key,0,arr.length-1);
        if(index != -1)
            System.out.println("Element "+key+" found at index: "+index);
        else
            System.out.println("Element not present");
    }

    static int binSearch(int arr[], int key, int low, int high)
    {
        if(high < low)
        {
            return -1;
        }

        int mid = low+(high-low)/2;

        if (key == arr[mid]) {
            return mid;
        }
        else if(key < arr[mid]) {
            return binSearch(arr,key,low,mid-1);
        }
        else {
            return binSearch(arr,key,mid+1,high);
        }
    }
}
