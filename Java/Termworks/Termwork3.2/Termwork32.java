/*
3.2) Define a class to represent a rectangle in which constructors and parameterized methods are used. It also has a method to compute area of rectangle.
i. First make a class rectangle in which we declare the parameterized constructor.
ii. Then demonstrate the use of parameterized method.
iii. Use a method to compute area of rectangle.
iv. Create a class to demonstrate the call of the methods in previously created class
rectangle holding constructors, parameterized methods and method to compute area of
rectangle.
*/
class rectangle
{
	private double len,width;
		
	public rectangle()
	{
		this.len = 0.0;
		this.width = 0.0;
	}
	
	public rectangle(double len, double width)
	{	
		this.len = len;
		this.width = width;
	}
	
	public double computeArea()
	{
		return len*width;
	}
	
	public void display()
	{
		System.out.println("Length: "+len);
		System.out.println("Width: "+width);
		System.out.println("Area: "+computeArea());
	}
}

class Termwork32
{
	public static void main(String args[])
	{
		rectangle r1 = new rectangle(12,5);
		System.out.println("Rectangle 1");
		r1.display();
		
		System.out.println();
		
		rectangle r2 = new rectangle(24,6);
		System.out.println("Rectangle 2");
		r2.display();
	}
}
