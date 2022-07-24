import java.util.ArrayList;

class isSortedArray{
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<Integer>(args.length);
        for(String x : args)
            arr.add(Integer.parseInt(x));
        if(isSorted(arr))
            System.out.println("Array is sorted");
        else
            System.out.println("Array is not sorted");
    }

    public static boolean isSorted(ArrayList<Integer> arr){
        for(int i=1;i<arr.size();i++)
            if(arr.get(i) < arr.get(i-1))
                return false;
        return true;
    }
}