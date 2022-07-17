/* Given a rope length n, it should be cut into maximum numnber of pieces for a given set of lengths.

I/p: n=5, a=2, b=5, c=1;
O/p: 5	//5 pieces of length 1 are possible

I/p: n=23, a=12, b=9, c=11;
O/p: 2	//1 piece of lengths 11 and 12

I/p: n=5, a=4, b=2, c=6;
O/p: -1	//Not possible
*/

class ropeCuttingProblem
{
	public static void main(String args[])
	{
		int n = Integer.parseInt(args[0]), a = Integer.parseInt(args[1]), b = Integer.parseInt(args[2]), c = Integer.parseInt(args[3]);
		
		n = maxPieces(n,a,b,c);
		if(n==-1)
		{
			System.out.println("Rope cannot be cut into smaller pieces");
			System.exit(0);	
		}
		else
		{
			System.out.println("Rope can be cut into "+n+" pieces");
		}
	}
	
	public static int maxPieces(int n, int a, int b, int c)
	{
		if(n==0)
			return 0;
		if(n<0)
			return -1;
		int res = max(maxPieces(n-a,a,b,c),maxPieces(n-b,a,b,c),maxPieces(n-c,a,b,c));
		if(res==-1)
			return -1;
		return res+1;
	}
	public static int max(int a, int b, int c)
	{
		int n;
		n = Math.max(a,b);
		n = Math.max(n,c);
		return n;
	}
}
