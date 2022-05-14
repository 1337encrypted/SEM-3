/*
4). Design a class by name myTriangle to model a triangle geometrical object with three sides. 
Include functions to:
• Initialize the three sides of triangle. 
• Determine the type of triangle represented by the three sides (Equilateral/ Isosceles/ 
Scalene triangle).
• Compute and return the area of the triangle.
*/

class myTriangle
{
	private double s1,s2,s3,s;

	public void setData(double s1, double s2, double s3)
	{
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
		s = (s1+s2+s3)/2;
	}

	public void checkTriangle()
	{
		if((s1+s2)>s3 && (s3+s2)>s1 && (s1+s3)>s2)
		{
			if(s1==s2 && s1==s3 && s2==s3)
				System.out.println("Equilateral triangle");
			else if(s1!=s2 && s1!=s3 && s2!=s3)
				System.out.println("Scelene triangle");
			else
				System.out.println("Isosceles triangle");
		}
		else
		{
			System.out.println("Traingle cannot be formed");
			System.exit(0);
		}
	}

	public double area()
	{
		return Math.sqrt(s*(s-s1)*(s-s2)*(s-s3));
	}

	public void display()
	{	
		System.out.println("Sides are: "+s1+" "+s2+" "+s3);
		System.out.println("Area: "+area());
	}
}

class TW04_myTriangle
{
	public static void main(String args[])
	{
		myTriangle t1 = new myTriangle();
		t1.setData(3,4,5);
		t1.checkTriangle();
		t1.display();
	}
}
