/*
26). Read a string containing 3_4 words using Scanner class object. Split it into words and for each word check if it's palindrome by writing a function isPalindrome(String the myWord, int s, int e) which return true if its palindrome else return false. Where s is start index and e is end index of the input myWord. Print it in uppercase if it is palindrome else reverse the string and print it in lowercase. Use appropriate string functions to implement the above problem statement.
*/

import java.util.Scanner;

public class TW26_palindrome
{
	public static void main(String args[])
	{
		String myWord;
		String allWords[];

		Scanner in = new Scanner(System.in);
		System.out.print("Enter the string: ");
		myWord = in.nextLine();

		allWords = myWord.split(" ");	

		for(String x : allWords)
		{
			System.out.println(x.length());
			if(isPalindrome(x,0,x.length()-1))
			{
				System.out.println(x.toUpperCase());
				System.out.println("Its a palindrome\n");
			}
			else
			{
				System.out.println(stringReverse(x).toLowerCase());
				System.out.println("Its not a palindrome\n");
			}
		}
	}

	public static boolean isPalindrome(String myWord, int s, int e)
	{
		for(int i=s;i<e/2;i++)
		{
			if(myWord.charAt(i) != myWord.charAt(e-i));
			{
				return false;
			}
		}
		return true;
	}

	public static String stringReverse(String x)
	{
		String s = "";
		for(int i=x.length()-1;i>=0;i--)
		{
			s = s+x.charAt(i);
		}
		return s;
	}
}

