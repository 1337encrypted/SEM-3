/*
6). Define a class to represent the student details such as name, roll number, marks obtained in three internal assessment tests. 
a) Identify type and declare the instance variables
b) Identify and develop the constructors to initialize the instance variables
c) Write a method computeAverage() to compute the average as the average of best two marks
d) Write a method to display the student details
Write the corresponding Driver class to instantiate an array of student objects and demonstrate the working of the application by invoking appropriate methods.
*/

import java.util.*;

class student
{
	private String name;
	private int rollNo;
	private double marks[] = new double[3];

	public student(String name, int rollNo, double ... marks)
	{
		this.name = name;
		this.rollNo = rollNo;
		this.marks[0] = marks[0];
		this.marks[1] = marks[1];
		this.marks[2] = marks[2];
	}

	public double computeAverage()
	{
		Arrays.sort(marks);
		return (marks[2]+marks[1])/2;
	}

	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("roll number: "+rollNo);
		System.out.println("average marks: "+computeAverage());
	}
}

class TW06_student
{
	public static void main(String args[])
	{
		student s1 = new student("Nidhi",19,98,88,100);
		s1.display();
	}
}
