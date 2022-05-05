/*
7). A certain small bank intends to automate few of its banking operations for its customers. Design a class by name mybankAccount to store the customer data having following details:
1.accountNumber 2. acctType 3. Name 4. Address 5. accountBalance
The class must have both default and parameterized constructors.
Write appropriate method to compute interest accrued on accountBalance based on accountType and time in years.
Assume 5% for S/B account 6.5% for RD account and 7.65 for FD account. Further, add two methods withdrawAmount/depositAmount with amount as input to withdraw and deposit respectively. The withdrawAmount method must report in-sufficient balance if accountBalance falls below Rs. 1000.
TASK 1 : Build the class with appropriate member variables, constructors and methods.
TASK 2 : Instantiate three objects of above type and perform different operations on the
same.
TASK 3 : Write a function to display all the three customer details in a tabular form with
appropriate column headings.
*/
class mybankAccount
{
	int accountNumber;
	String accType,name,address;
	double accountBalance;
	
	public mybankAccount()
	{
		this.accountNumber = 0;
		this.accType = " ";
		this.name = " ";
		this.address = " ";
		this.accountBalance = 0.0;
	}
	
	public mybankAccount(int accountNumber, String accType, String name, String address, double accountBalance)
	{
		this.accountNumber = accountNumber;
		this.accType = accType;
		this.name = name;
		this.address = address;
		this.accountBalance = accountBalance;
	}
	
	public void interest(int time)
	{
		double i = 0.0;
		
		if(accType.equalsIgnoreCase("SB"))
		{
			i = (accountBalance*time*5)/100;
		}
		else if(accType.equalsIgnoreCase("RD"))
		{
			i = (accountBalance*time*6.5)/100;
		}
		else if(accType.equalsIgnoreCase("FD"))
		{
			i = (accountBalance*time*7.65)/100;
		}
		
		System.out.println("Simple intrest: "+i);
	}
	
	public void withdrawAmount(double amt)
	{
		if(accountBalance-amt > 1000)
		{
			accountBalance = accountBalance - amt;
		
			System.out.println("Amount withdrawed: "+amt);
			System.out.println("Balance updated: "+accountBalance);
		}
		else
		{
			System.out.println("Insufficient balance");
		}
	}
	
	public void depositAmount(double amt)
	{
			accountBalance = accountBalance + amt;
			System.out.println("Amount deposited: "+amt);
			System.out.println("Balance updated: "+accountBalance);
	}
	
	public void displayBalance()
	{
		System.out.println("Account Balance: "+accountBalance);
	}
	
	public void displayDetails()
	{
		System.out.println("Name: "+this.name);
		System.out.println("Address: "+this.address);
		System.out.println("Account number: "+this.accountNumber);
		System.out.println("Account Type: "+this.accType);
		System.out.println("Account Balance: "+this.accountBalance);
	}
}

class TW7_mybankAccount
{
	public static void main(String args[])
	{
		mybankAccount p1 = new mybankAccount(1,"SB","Nilesh","C.T.S 51093 1st Main 8th cross, Ashok nagar",5000);
		p1.displayDetails();
		p1.interest(5);
		p1.depositAmount(50000);
		p1.withdrawAmount(14000);
		p1.displayBalance();
		System.out.println("\n");
		
		mybankAccount p2 = new mybankAccount(1,"RD","Aditya","C.T.S 80520 3st Main 5nd cross, Hanuman nagar",9000);
		p2.displayDetails();
		p2.interest(10);
		p2.depositAmount(30000);
		p2.withdrawAmount(40000);
		p2.displayBalance();
		System.out.println("\n");
		
		mybankAccount p3 = new mybankAccount(1,"FD","Ram","C.T.S 20956 6st Main 10nd cross, RaniChennama nagar",15000);
		p3.displayDetails();
		p3.interest(15);
		p3.depositAmount(5600);
		p3.withdrawAmount(16000);
		p3.displayBalance();
		System.out.println("\n");
	}
}