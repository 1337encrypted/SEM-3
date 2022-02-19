/*
3.4) Create a IndMoney class with two integer instance variables rupees and paise. Add a constructor with two parameters for initializing a IndMoney object. The constructor should check the paise value is between 0 and 99 and, if not, transfer some of the paise to the rupees
variable to make it between 0 and 99.
Add a plus() method to the class that takes a IndMoney object as parameter. It creates and returns a new IndMoney object representing the sum of the
object whose plus() method is being invoked and the parameter. It does not modify the values of the two existing objects. It should also ensure that the value of the paise instance variable of the new object is between 0 and 99. For example, if x is an IndMoney object with 12 rupees and 80 paise, and if y is an IndMoney object with 8 rupees and 90 paise, then x.plus(y)
will return a new IndMoney object with 21 rupees and 70 paise. Also, create a
IndMoneyDemo driver class that tests the IndMoney class.
*/

class indMoney
{
	int rupees,paise;
	
	public indMoney(int rupees, int paise)
	{
		if(paise > 99)
		{
			int tmprupees = paise/100;
			paise = paise % 100;
			
			this.paise = paise;
			this.rupees = rupees+tmprupees;
		}
		else
		{
			this.paise = paise;
			this.rupees = rupees;
		}
	}
	
	public indMoney plus(indMoney money)
	{		
		money.rupees = this.rupees+money.rupees;
		money.paise = this.paise+money.paise;
		
		if(money.paise > 99)
		{
			int tmprupees = money.paise/100;
			money.paise = money.paise % 100;
			money.rupees = money.rupees+tmprupees;
		}
			
		return money;
	}
	
	public void display()
	{
		System.out.println("Rupees: "+this.rupees);
		System.out.println("Paise: "+this.paise);
		System.out.println("\n");
	}
}

class Termwork34
{
	public static void main(String args[])
	{
		indMoney m1 = new indMoney(35,650);
		System.out.println("currency m1");
		m1.display();
				
		indMoney m2 = new indMoney(75,660);
		System.out.println("currency m2");
		m2.display();
		
		indMoney m3 = new indMoney(0,0);
		m3 = m2.plus(m1);
		System.out.println("currency m3");
		m3.display();
	}
}
