class firstNnatural
{
	public static void main(String args[])
	{
		System.out.println("Sum: "+firstN(Integer.parseInt(args[0])));
	}
	public static int firstN(int n)
	{
		if(n == 0)
			return 0;
		return n+firstN(n-1);
	}
}
