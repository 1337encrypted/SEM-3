/*
9.2) Two strings will be anagram to each other if and only if they contain the same number of
characters (order of the characters doesn&#39;t matter). That is, If the two strings are anagram to
each other, then one string can be rearranged to form the other string. For Example: creative
and reactive are anagrams. Write a Java program to test whether two strings are anagrams or
not. (listen and silent, stressed and desserts, dusty and study)
*/
import java.util.Arrays;
import java.util.Scanner;
class anagram
{
	private String str1, str2;
	
	public anagram()
	{
		System.out.println("Enter the two words: ");
		Scanner in = new Scanner(System.in);
		this.str1 = in.next();
		this.str2 = in.next();
	}
	public void checkAnagram()
	{
		str1 = str1.toLowerCase();
		str2 = str2.toLowerCase();
		
		char s1[] = str1.toCharArray();
		char s2[] = str2.toCharArray();
		
		String str3 = bubbleSort(s1);
		String str4 = bubbleSort(s2);
		
		if(str3.equals(str4) == true)
			System.out.println("They are anagrams");
		else
			System.out.println("They are not anagrams");
		
	}
	public static String bubbleSort(char s1[])
	{
		for(int i=0;i<s1.length;i++)
		{
			for(int j=0; j<s1.length-i-1; j++)
			{
				if(s1[j] > s1[j+1])
				{
					char tmp = s1[j];
					s1[j] = s1[j+1];
					s1[j+1] = tmp;
				}
			}
		}
		return Arrays.toString(s1);
	}
}
class Termwork92
{
	public static void main(String args[])
	{
		anagram a1 = new anagram();
		a1.checkAnagram();	
	}
}
