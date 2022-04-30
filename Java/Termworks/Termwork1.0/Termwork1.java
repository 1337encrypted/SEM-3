/*
1) Write a Java program to accept IA marks obtained by five students in three subjects. The program should accept marks 
obtained by each student and display the total marks and the average marks. The average marks is computed using a method 
as the average of best two marks obtained.
*/

import java.util.Scanner;

class student
{
	private double sub[] = new double[3];
	private double total;
	private String name;

	public student()
	{
		Scanner in = new Scanner(System.in);

		System.out.print("Enter the name of the student: ");		
		name = in.next();
		System.out.print("Enter the marks: ");
		for(int i=0;i<3;i++)
			sub[i] = in.nextDouble();
	}

	public void display()
	{
			System.out.print("Name: "+toString());
			System.out.println("\nsubject 1: "+sub[0]+"\nsubject 2: "+sub[1]+"\nsubject 3: "+sub[2]);
			System.out.println("Average: "+average());
			System.out.println();
	}

	public double average()
	{
		if(sub[0] > sub[1] && sub[0] > sub[2])
		{
			if(sub[1] > sub[2])
				return (sub[0]+sub[1])/2;
			else
				return (sub[0]+sub[2])/2;
		}
		else if (sub[1] > sub[2])
		{
			if(sub[2] > sub[0])
				return (sub[1]+sub[2])/2;
			else
				return (sub[1]+sub[0])/2;
		}
		else
		{
			if(sub[1] > sub[0])
				return (sub[2]+sub[1])/2;
			else
				return (sub[2]+sub[0])/2;
		}
	}

	public String toString()
	{
		return this.name;
	}
}


class Termwork1
{
	public static void main(String args[])
	{
		student s[] = new student[5];
		
		for(int i=0;i<s.length;i++)
			s[i] = new student();		

		for(int i=0;i<s.length;i++)
			s[i].display();
	
	}
}