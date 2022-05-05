/*
24) Design a class CustomerAccount that has acctNum, custName and balance as member variables and a constructor to initialize these. Implement withDraw and depositAmount methods that accepts amount as argument and it must throw an user defined exception called InsufficientBalalance/InvalidAmount exception when amount is greater than balance/ amount is negative respectively. Design two classes InsufficientBalance and InvalidAmount that extend the Exception class and override toString method. Demonstrate the working of the user defined exceptions by instantiating an object of customerAccount class and invoking withDraw and depoistAmount in try… catch... finally block.
*/


import java.util.Scanner;
class CustomerAccount{  
    int accNo;
    String custName;
    double balance;
    CustomerAccount(int accNo,String custName,double balance){
        this.accNo = accNo; 
        this.custName = custName; 
        this.balance = balance;
    }
    void withdrawAmt(double Amt) 
    {
        try{
            if(balance-Amt <0)
            throw new InsufficientBalException("Insufficient Balance");
            balance-=Amt;
            System.out.println("Balance in the account is "+ balance);
        }
        catch (InsufficientBalException e) 
        {
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println();
        }
    }
    void depositAmt(double Amt)
    {
        try
        {
            if(Amt<0)
            throw new InvalidAmtException("Invalid amount");
            balance+=Amt;
            System.out.println("Balance in the account is "+ balance);
        }
        catch( InvalidAmtException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e);
            System.out.println();
        }
    }
}
class InsufficientBalException extends Exception{ 
    InsufficientBalException(String msg)
    {
        super(msg);
    }
    public String toString()
    {
        return "Amount can't be withdrawm as there is insufficient Balance";
    }
}
class InvalidAmtException extends Exception{
    InvalidAmtException(String msg)
    {
        super(msg);
    }
    public String toString()
    {
        return "Can't deposit as amount is negative";
    }
}

class TW24_CustomerAccountException
{
	public static void main(String[] args) 
	{
		CustomerAccount c =new CustomerAccount(101,"Harry Styles",1000);
	      c.depositAmt(-500);
      	c.withdrawAmt(1200);
	      c.depositAmt(1500);
      	c.withdrawAmt(1000);
    	}
}