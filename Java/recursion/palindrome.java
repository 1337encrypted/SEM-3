class palindrome
{
	public static void main(String args[])
	{
		if(checkPalindrome(args[0],0,args[0].length()-1))
			System.out.println("Its a Palindrome");
		else
			System.out.println("Its not a Palindrome");
	}
	public static boolean checkPalindrome(String s, int start, int end)
	{
		if(start >= end)
			return true;
		return(s.charAt(start) == s.charAt(end)) && checkPalindrome(s,start+1,end-1);
	}
}
