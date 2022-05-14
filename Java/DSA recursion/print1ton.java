class print1ton
{
	public static void main(String a[])
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.print("Enter the number: ");
		int n = in.nextInt();
		fun1(n);
	}
	
	public static void fun1(int n)
	{
		if(n==0)
			return;
		fun1(n-1);
		System.out.print(n+" ");
	}
}
