class sumOfDigits
{
	public static void main(String args[])
	{
		System.out.println(sod((Integer.parseInt(args[0]))));
	}
	public static long sod(long n)
	{
		if(n == 0)
			return 0;
		return n%10+sod(n/10);
	}
}
