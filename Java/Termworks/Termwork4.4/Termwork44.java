/*
4.4) Implement a BANK class to demonstrate the inheritance in Java by implementing
getRateOfInterestmember function for three different banks, as shown below.
*/

class bank
{  
	protected float rate;
	
	protected bank(float rate)
	{
		this.rate = rate;
	}
	
	protected float getRateOfInterest()
	{
		return this.rate;
	}  
	
	public void display()
	{
		System.out.println("Rate: "+this.rate);
	}
}    
class SBI extends bank
{  
	public SBI(float rate)
	{
		super(rate);
	}
	
	public float getRateOfInterest()
	{
		return this.rate;
	}  
	
	public void display()
	{
		System.out.print("SBI bank ");
		super.display();
		System.out.println();
	}
}  
  
class ICICI extends bank
{ 
	public ICICI(float rate)
	{
		super(rate);
	}
	
	public float getRateOfInterest()
	{
		return this.rate;
	}  
	
	public void display()
	{
		System.out.print("ICICI bank ");
		super.display();
		System.out.println();
	}
}  
class AXIS extends bank
{  
	public AXIS(float rate)
	{
		super(rate);
	}
	
	public float getRateOfInterest()
	{
		return rate;
	}  
	
	public void display()
	{
		System.out.print("AXIS bank ");
		super.display();
		System.out.println();
	}
}  
 
class Termwork44
{  
	public static void main(String args[])
	{  
		SBI s = new SBI(10f);  
		ICICI i = new ICICI(9f);  
		AXIS a = new AXIS(8f);  
		
		s.getRateOfInterest();  
		s.display();
		
		i.getRateOfInterest();  
		i.display();  
		
		a.getRateOfInterest();  
		a.display();
	}  
}  
