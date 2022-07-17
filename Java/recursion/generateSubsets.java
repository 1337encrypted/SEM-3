/*Write a recursive method to find all substrings in a string
I/p: s = "AB"
O/p: " ", "A", "B", "C", "AB", "AC", "BC", "ABC".

Note: For a string of length n, there are 2^n substrings
*/
class generateSubsets
{
	public static void main(String args[])
	{
		generateSubsets(args[0],"",0);
	}
	
	public static void generateSubsets(String s, String curr, int i)
	{
		if(i==s.length())
		{
			System.out.print("'"+curr+"'"+" ");
			return;
		}
		generateSubsets(s,curr,i+1);
		generateSubsets(s,curr+s.charAt(i),i+1);
	}
}
