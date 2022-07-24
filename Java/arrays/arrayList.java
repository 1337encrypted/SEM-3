import java.util.ArrayList;
public class arrayList
{
	public static void main(String args[])
	{
		arraylist<Integer> arr = new arrayList<Integer>();
		for(int i=0; i<args.length-2;i++)
			arr.add(Integer.parseInt(args[i]));
		int ele = Integer.arseInt(args[0]);
		int pos = Integer.arseInt(args[1]);
		if(insert(arr,ele,pos))
			System.out.println("Element "+ele+" inserted at "+pos);
		else
			System.out.println("Insertion falied");
	}
	public static boolean insert(Integer arr[], int ele, int pos)
	{
		if()
	}
}
