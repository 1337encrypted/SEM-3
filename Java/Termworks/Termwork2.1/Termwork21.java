/*
2.1) Design a class by name myCircle to model Circle geometrical object with its center and
radius that enables:
1. Initializing the center, radius and
2. Compute area, perimeter, and diameter of the circle object/s.

TASK 1: Identify member variable/s and their types
TASK 2: Identify Constructor/s along with their arguments (if any) to initialize the
member variables
TASK 3: Identify the methods along with their arguments and return types.
TASK 4: Identify member variable getters/setters (if needed)
*/

class myCircle
{
	private double x,h,y,k,r; 

	public myCircle(double x, double h, double y, double k)
	{
		this.x = x;
		this.h = h;
		this.y = y;
		this.k = k;
		this.r = Math.sqrt((x-h)*(x-h)+(y-k)*(y-k));
	}
	
	public double computeDiameter()
	{
		return 2*r;
	}
	
	public double computeArea()
	{
		final double PI = 3.1412;
		
		return PI*r*r;
	}
	
	public double computePerimeter()
	{
		final double PI = 3.1412;
		
		return 2*PI*r;
	}
}

class Termwork21
{
	public static void main(String args[])
	{
		myCircle obj = new myCircle(12,3,14,6);
		System.out.println("Diameter: "+obj.computeDiameter());
		System.out.println("Area: "+obj.computeArea());
		System.out.println("Perimeter: "+obj.computePerimeter());
	}
}
