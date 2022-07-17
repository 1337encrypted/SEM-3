/*
Given the total number of persons n and a number k which indicates that k-1 persons are skipped and kth person is killed in circle in a fixed direction.

The task is to choose the safe place in the circle so that when you perform these operations starting from 1st place in the circle, you are the last one remaining and survive. 

Example 1:
Input:
n = 3 k = 2
Output: 3
Explanation: There are 3 persons so 
skipping 1 person i.e 1st person 2nd 
person will be killed. Thus the safe 
position is 3.

Example 2:
Input:
n = 5 k = 3
Output: 4
Explanation: There are 5 persons so 
skipping 2 person i.e 3rd person will 
be killed. Thus the safe position is 4.
*/

class josephusProblem
{
	public static void main(String args[])
	{
		int n = jos(Integer.parseInt(args[0]),Integer.parseInt(args[1]));
		System.out.println(n);
	}
	public static int jos(int n, int k)
	{
		if(n==1)
			return 0;
		else	
			return (jos(n-1,k)+k)%n;
	}
}
