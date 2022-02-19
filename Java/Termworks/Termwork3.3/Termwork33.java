/*
3.3) Write a Java program to represent a Complex number. Include member functions to:
1. Initialize a complex number to a default value of zero (default constructor)
2. Initialize a complex number to a user defined value (parameterized constructor)
3. Add two complex numbers and return the result. (Parameterized method)
4. Subtract two complex numbers and return the result. (Parameterized method)
5. Display a complex number. (non-parameterized method)
*/

class complex
{
	private double real, img;

	public complex()
	{
		this.real = 0.0;
		this.img = 0.0;	
	}

	public complex(double real, double img)
	{
		this.real = real;
		this.img = img;		
	}
	
	public static complex add(complex n1, complex n2)
	{
		complex res = new complex(0,0);
		
		res.real = n1.real+n2.real;
		res.img = n1.img+n2.img;
		
		return res;
	}
	
	public void show()
	{
		if(img > 0)
			System.out.println(this.real+"+"+this.img);
		else
			System.out.println(this.real+""+this.img);
	}
}

class Termwork33
{
	public static void main(String args[])
	{
		complex num = new complex(13,5);
		complex num1 = new complex(14,6);
		
		complex res = complex.add(num,num1);
		
		res.show();
	}
}
