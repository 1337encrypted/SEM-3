/*
2.2) Define a class to represent the student details such as name, roll number, marks obtained
in three internal assessment tests.
a) Identify type and declare the instance variables
b) Identify and develop the constructors to initialize the instance variables
c) Write a method computeAverage() to compute the average as the average of best two
marks
d) Write a method to display the student details
Write the corresponding Driver class to instantiate an array of student objects and
demonstrate the working of the application by invoking appropriate methods.
*/
import java.util.Scanner;
class student
{
	private String name;
	private int rollno;
	private double marks1,marks2,marks3;
	
	/*
	public student(String name, int rollno, double marks1, double marks2, double marks3)
	{
		this.name = name;
		this.rollno = rollno;
		this.marks1 = marks1;
		this.marks2 = marks2;
		this.marks3 = marks3;
	}
	*/
	
	public double computeAverage()
	{
		double first,second,last,total;
		
		first = Math.max(marks1,marks2);
		first = Math.max(first,marks3);
		
		last = Math.min(marks1,marks2);
		last = Math.min(last,marks3);
		
		total = marks1+marks2+marks3;
		
		second = total-(first+last);
		
		return (first+second)/2;
	}
	
	public void getdata()
	{
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter the student name: ");
		this.name = in.next();
		System.out.println("Enter the roll number: ");
		this.rollno = in.nextInt();
		System.out.println("Enter marks1: ");
		this.marks1 = in.nextDouble();
		System.out.println("Enter marks2: ");
		this.marks2 = in.nextDouble();
		System.out.println("Enter marks3: ");
		this.marks3 = in.nextDouble();
	}
	
	public void display()
	{
		System.out.println("Name: "+name);
		System.out.println("Roll number: "+rollno);			
		System.out.println("marks1: "+marks1);
		System.out.println("marks2: "+marks2);
		System.out.println("marks3: "+marks3);
		System.out.println("Average marks: "+computeAverage());
		System.out.println();
	}
	
}

class Termwork22
{
	public static void main(String args[])
	{
		String name;
		int rollno;
		double marks1,marks2,marks3;
		
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of students: ");
		int n = in.nextInt();
		
		student obj[] = new student[n];
		
		for(int i=0; i<n; i++)
		{	
			obj[i] = new student();
			obj[i].getdata();
		}
		System.out.println("\n\nDetails of students are\n\n");
		for(int i=0; i<n; i++)
		{
			obj[i].display();
		}
	}
}
