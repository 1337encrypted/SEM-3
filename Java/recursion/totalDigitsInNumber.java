/*
You are given a number n. You need to find the count of digits in n.

Example 1:

Input:
n = 1
Output: 1
Explanation: Number of digit in 1 is 1.

Example 2:

Input:
n  = 99999
Output: 5
Explanation:Number of digit in 99999 is 5
*/

class totalDigitsInNumber
{
	public static void main(String args[])
	{
		System.out.println(countDigits(Integer.parseInt(args[0])));
	}
	public static int countDigits(int n)
	{
        	if(n<10)
	            return 1;
	        return (1+countDigits(n/10));
    	}
}
