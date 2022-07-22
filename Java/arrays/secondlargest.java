/*
Find the second largest element in the array naive approach

I/P: 10,20,50,70,80,90
O/P: 80

I/P: 10,10,10
O/P: -1

Time compelixity
    Best time: O(n^2)
    Worst time: O(n^2)
    Average time: O(n^2)
Space compelixity O(1)
 */
class secondlargest {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>();
        for (int i = 0; i < args.length; i++)
            arr.add(Integer.parseInt(args[i]));
        if(secondlarge(arr) > 0)
            System.out.println("Second largest element: " + arr.get(secondlarge(arr)));
        else
            System.out.println("Element not present");
    }

    public static int secondlarge(ArrayList<Integer> arr){

    }
}