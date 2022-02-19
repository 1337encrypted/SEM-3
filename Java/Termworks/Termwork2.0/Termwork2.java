/*
TW 2: Write a program to demonstrate the implementation of class and its member methods.

Design a class by name myTriangle to model a triangle geometrical object with three sides.
Include functions to:
	Initialize the three sides of triangle.
	Determine the type of triangle represented by the three sides 
	(Equilateral/ Isosceles/Scalene triangle).
	Compute and return the area of the triangle.
	
Note:
When three sides are given we use the following formula:
s=(a+b+c)/2;
area=sqrt(s*(s-a)*(s-b)*(s-c));
*/

class myTriangle
{
	private double s1,s2,s3,s;
	
	public myTriangle(double s1,double s2,double s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		s = (s1+s2+s3)/2;
	}
	
	public void traingleType()
	{
		if((s1+s2>s3) && (s1+s3>s2) && (s3+s2>s1))
		{
			if(s1==s2 && s2==s3 && s3==s1)
				System.out.println("Its a Equilateral triangle");
			else if((s1==s2 && s1!=s3) && (s2==s3 && s2!=s1) && (s1==s3 && s1!=s2))
				System.out.println("Its a Isoceles triangle");
			else
				System.out.println("Its a Scalene triangle");
		}
		else
			System.out.println("Traingle cannot be formed");		
	}
	
	public double computeArea()
	{
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}
}

class Termwork2
{
	public static void main(String args[])
	{
		myTriangle t1 = new myTriangle(13,14,15);
		t1.traingleType();
		System.out.println("Area = "+t1.computeArea());
	}
}
