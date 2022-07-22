/*
Find the largest element in the array

I/P: 10,20,50,70,80,90
O/P: 90

I/P: 10,100,50
O/P: 100

Time compelixity
    Best time: O(1)
    Worst time: O(n)
    Average time: O(n)
Space compelixity O(1)
 */
import java.util.ArrayList;
//import java.util.Collections;
class largestelement
{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for(int i=0;i<args.length;i++)
            arr.add(Integer.parseInt(args[i]));
        System.out.println("Largest element in array: "+arr.get(largestele(arr)));
    }

    public static Integer large(ArrayList<Integer> arr) {
        int largest = 0;
        for(int i=0;i<arr.size();i++)
            if(arr.get(largest) < arr.get(i))
                largest  = i;
        return largest;
//        return Collections.max(arr);
    }
}