/*
12). The class Cylinder inherits all the instance variables (radius and color) and methods (getRadius(), getArea(), among others) from its superclass Circle. It further defines a variable called height, three methods getHeight(), setHeight() and getVolume() and its own constructors. Implement the hierarchy as shown below:
*/

class circle
{
	protected double radius;
	protected String colour;
	
	protected circle(String colour)
	{
		this.colour = colour;
	}
	
	protected void getRadius(double radius)
	{
		this.radius = radius;
	}
	protected double getArea()
	{
		final double PI = 3.1412;
		return PI*radius*radius;
	}
}

class cylinder extends circle
{
	private double height;
	
	public cylinder(String colour, double radius)
	{
		super(colour);
		getRadius(radius);
	}
	
	public void setHeight(double height)
	{
		this.height = getHeight(height);
	}
	
	public double getHeight(double height)
	{
		return height;
	}
	
	public double getVolume()
	{
		return getArea()*height;
	}
}

class TW12_cylinderExtendsCircle
{
	public static void main(String args[])
	{
		circle c1 = new circle("Red");
		c1.getRadius(5);
		System.out.println("Colour of circle: "+c1.colour);
		System.out.println("Area of circle: "+c1.getArea());
		System.out.println();
		cylinder c2 = new cylinder("Blue",10);
		c2.setHeight(20);
		System.out.println("Colour of cylinder: "+c2.colour);
		System.out.println("Area of cylinder: "+c2.getArea());
		System.out.println("Volume of cylinder: "+c2.getVolume());
	}
}