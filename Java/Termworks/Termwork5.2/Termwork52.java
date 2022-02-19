/*
5.2) Implement a linear search function by using method overloading concept for an array
of integers, double and character elements.
*/
import  java.util.Scanner;
class overloaded{

	private int intArr[];
	private double doubleArr[];
	private char charArr[];
	
	public overloaded(int len){
	
		intArr = new int[len];
		doubleArr = new double[len];
		charArr = new char[len];
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the integer array");
		for(int i=0;i<len;i++)
			intArr[i] = in.nextInt();
			
		System.out.println("Enter the double array");
		for(int i=0;i<len;i++)
			doubleArr[i] = in.nextDouble();
			
		System.out.println("Enter the character array");
		for(int i=0;i<len;i++)
			charArr[i] = in.next().charAt(0);
	}	
	
	public boolean linearSearch(int key)
	{
		for(int i=0;i<intArr.length;i++)
		{
			if(intArr[i] == key)
				return true;
		}
		return false;
	}
	
	public boolean linearSearch(double key)
	{
		for(int i=0;i<doubleArr.length;i++)
		{
			if(doubleArr[i] == key)
				return true;
		}
		return false;
	}
	
	public boolean linearSearch(char key)
	{
		for(int i=0;i<charArr.length;i++)
		{
			//if(charArr[i].charAt(0) == key)
			if(charArr[i] == key)
				return true;
		}
		return false;
	}
}

class Termwork52
{
	public static void main(String args[])
	{
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the sizes of the arrays: ");
		int size = in.nextInt();
		
		overloaded obj = new overloaded(size);
		
		while(true)
		{
			System.out.println("\n==================");
			System.out.println("1.Search integer");
			System.out.println("2.Search doubles");
			System.out.println("3.Search characters");
			System.out.println("4.Exit");
			System.out.print("Choose: ");
			int ch = in.nextInt();
			
			switch(ch)
			{
				case 1: System.out.print("Enter the element: ");
					int keyint = in.nextInt();
					if(obj.linearSearch(keyint))
						System.out.println("\nKey found");
					else
						System.out.println("\nKey not found");
					break;
					
				case 2: System.out.print("Enter the element: ");
					double keydouble = in.nextDouble();
					if(obj.linearSearch(keydouble))
						System.out.println("\nKey found");
					else
						System.out.println("\nKey not found");
					break;
					
				case 3: System.out.print("Enter the element: ");
					char key = in.next().charAt(0);
					if(obj.linearSearch(key))
						System.out.println("\nKey found");
					else
						System.out.println("\nKey not found");
					break;
					
				case 4: System.exit(0);
				default: System.out.println("Invalid case, please try again.");
					continue;
			}
			
		}
		
	}
}
