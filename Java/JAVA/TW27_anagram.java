/*
27). Two strings will be anagram to each other if and only if they contain the same number of characters (order of the characters doesn't matter). That is, If the two strings are anagram to each other, then one string can be rearranged to form the other string. For Example: creative and reactive are anagrams. Write a Java program to test whether two strings are anagrams or not. (listen and silent, stressed and desserts, dusty and study).
*/

import java.util.*;

public class anagram
{
	private String s1,s2;
	private char str1[],str2[];
	
	public anagram(String s1, String s2)
	{
		this.s1 = s1;
		this.s2 = s2;
		str1 = new char[s1.length()];
		str2 = new char[s2.length()];
	}
	
	public boolean checkAnagram()
	{
		if(s1.length() != s2.length())
			return false;

		str1 = s1.toCharArray();
		str2 = s2.toCharArray();
		
		Arrays.sort(str1);
		Arrays.sort(str2);
	
		for(int i=0;i!='\0';i++)
		{
			if(str1[i] != str2[i])
				return false;
		}
		return true;
	}
}

class TW27_anagram
{
	public static void main(String args[])
	{
		anagram a1 = new anagram("study","dusty");
		display(a1);
		anagram a2 = new anagram("stressed","desserts");
		display(a2);
		anagram a3 = new anagram("stresd","deserts");
		display(a3);
	}

	public static void display(anagram s1)
	{
		if(s1.checkAnagram())
			System.out.println("They are anagrams");
		else
			System.out.println("They are not anagrams");
	}
}