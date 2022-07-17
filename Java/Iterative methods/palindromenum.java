/*Write a iterative solution to check if a number is a palindrome or not*/
class palindromenum
{
	public static void main(String args[])
	{
		if(isPalindrome(Integer.parseInt(args[0])))
			System.out.println("Its a Palindrome");
		else
			System.out.println("Its not a Palindrome");
	}
	
	public static boolean isPalindrome(int n)
	{
		int rev=0, n1=n;
		while(n != 0)
		{
			int temp = n%10;
			rev=10*rev+temp;
			n/=10;
		}
		return(n1==rev);
	}
}
