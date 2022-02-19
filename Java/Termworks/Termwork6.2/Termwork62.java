/*
Write a Java program that defines an abstract class called Account and accepts the following customer account information:

1) Customer Name
2) Account Number
3) Balance

and provides below operations on customer account:

1) Deposit
2) Withdraw
3) Display Balance
4) Display full account details

There are two types of accounts – Savings and Current. The Current account has an overdraft facility limited to Rs. 75,000 per account. The following constraints hold on these accounts:

Savings Account:

1) The total number of deposits for a Savings account cannot exceed three per day.
2) The amount deposited into a savings account cannot exceed Rs.5000 in each transaction.
3) The maximum withdrawal amount is Rs.25,000 per transaction.
4) The minimum balance to be maintained is Rs. 10,000. 

Current account:

1) The amount withdrawn cannot exceed the overdraft limit once the account balance is zero.
2) Maximum number of withdrawals is two.
3) No limit on the number of deposits.
4) Each deposit cannot exceed Rs. 25,000.

Test the program by creating objects of the Savings and Current Accounts.
*/

abstract class account
{
	public String custName;
	public int accNum;
	public double accBal;
	
	public account(String custName, int accNum, double accBal)
	{
		this.custName = custName;
		this.accNum = accNum;
		this.accBal = accBal;
	}
	
	abstract public void deposit();
	abstract public void withdraw();
	
	public void dispBal()
	{
		System.out.println("Account balance: "+accBal);
	}
	
	public void display()
	{
		System.out.println("Customer Name: "+custName);
		System.out.println("Account number: "+accNum);
		System.out.println("Account balance: "+accBal);
	}
}

class savings extends account
{
	private int transcations;
	private double maxDeposite, maxWithdraw, minBalance;	
	
	public savings(String custName, int accNum, double accBal)
	{
		super(custName,accNum,accBal);
		this.transcations = 3;
		this.maxDeposite = 5000;
		this.maxWithdraw = 25000;
		this.minBalance = 10000;
	}
	
	public void deposit()
	{
		if(transcations > 0)
		{
			java.util.Scanner in = new java.util.Scanner(System.in);
			System.out.println("Enter the amount you want to deposite: ");
			double amt = in.nextDouble();
			if(amt < 0)
				System.out.println("Invalid amount, Please enter a valid amount");
			else if(amt > maxDeposite)
				System.out.println("Please enter a amount less than"+maxDeposite);
			else
			{
				accBal += amt;
				transcations--;
				System.out.println("Transcation done successfully");
			}
		}
		else
			System.out.println("You have reached the maximum limit of transcations, please try again tomorrow, thankyou");
	}
	
	public void withdraw()
	{
		if(transcations > 0)
		{
			java.util.Scanner in = new java.util.Scanner(System.in);
			System.out.println("Enter the amount you want to Withdraw: ");
			double amt = in.nextDouble();
			if(amt < 0)
			{
				System.out.println("Invalid amount, Please enter a valid amount");
			}
			else if(amt > maxWithdraw)
			{
				System.out.println("Please enter a amount less than"+maxWithdraw);
			}
			else if(accBal-amt <= minBalance)
			{
				System.out.println("Balance cannot be less than"+minBalance+"please try again");
			}
			else
			{
				accBal -= amt;
				transcations--;
				System.out.println("Transcation done successfully");
			}
			
		}
		else
			System.out.println("You have reached the maximum limit of transcations, please try again tomorrow, thankyou");
	}
	/*
	public void dispBal()
	{
		super.dispBal();
	}
	
	public void display()
	{
		super.display();
	}
	*/
}

class current extends account
{
	private boolean overDraftState;
	private int transcations;
	private double overDraftLim, maxWithdrawLim, maxDepositeAmt;	
	
	public current(String custName, int accNum, double accBal)
	{
		super(custName,accNum,accBal);
		this.overDraftState = false;
		this.overDraftLim = 75000;
		this.maxWithdrawLim = 2;
		this.maxDepositeAmt = 25000;
	}
	
	public void deposit()
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Enter the amount you want to deposite: ");
		double amt = in.nextDouble();
		
		if(amt < 0)
		{
			System.out.println("Invalid amount, Please enter a valid amount");
		}
		else if(amt > maxDepositeAmt)
		{
			System.out.println("Please try entering a amount less than 25000");
		}
		else
		{
			accBal += amt;
			System.out.println("Amount deposited successfully");
		}
	}
	
	public void withdraw()
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		System.out.println("Enter the amount you want to Withdraw: ");
		double amt = in.nextDouble();
		
		if(amt < 0)
		{
			System.out.println("Invalid amount, Please enter a valid amount");
		}
		else if(accBal-amt < 0)
		{
			System.out.println("Cannot withdraw, Insufficient funds");
		}
		if(overDraftState && amt > overDraftLim)
		{
			System.out.println("Cannot withdraw more than over draft limit, please try withdrawing less than "+overDraftLim);
		}
		else if(overDraftState && amt < overDraftLim)
		{
			if(maxWithdrawLim > 0)
			{
				accBal -= amt;
				maxWithdrawLim--;
				System.out.println("Amount withdrawed successfully");
			}
			else
				System.out.println("You have reached maximum withdrawals, Please try again tomorrow thankyou");
		}
		else
		{
			if(maxWithdrawLim > 0)
			{
				accBal -= amt;
				maxWithdrawLim--;
				System.out.println("Amount withdrawed successfully");
				if(accBal == 0)
					overDraftState = true;
			}
			else
				System.out.println("You have reached maximum withdrawals, Please try again tomorrow thankyou");
		}
	}
	/*
	public void dispBal()
	{
		super.dispBal();
	}
	
	public void display()
	{
		super.display();
	}
	*/
}

class Termwork62
{
	public static void menu(account obj)
	{
		java.util.Scanner in = new java.util.Scanner(System.in);
		while(true)
		{
			System.out.println("\n1.Deposit");
			System.out.println("2.Withdraw");
			System.out.println("3.Display balance");
			System.out.println("4.Display account");
			System.out.print("Choose: ");
			
			int ch = in.nextInt();
			
			switch(ch)
			{
				case 1: obj.deposit();
					break;
				case 2: obj.withdraw();
					break;
				case 3: obj.dispBal();
					break;
				case 4: obj.display();
					break;
				default: System.out.println("Invalid input. Please try again");
			}
			
		}
	}
	/*
	public void choose(account obj, int n)
	{
		for(int i=0;i<;i++)
		{
			
		}
	}
	*/
	public static void main(String args[])
	{
		String name;
		int accnum;
		//int i=0,j=0;
		double balance;
		java.util.Scanner in = new java.util.Scanner(System.in);
		
		while(true)
		{
			System.out.println("1.Add account: ");
			System.out.println("2.Delete account");
			System.out.println("3.Choose account");
			System.out.println("4.Exit");
			System.out.print("Choose: ");
			int ch = in.nextInt();
			
			switch(ch)
			{
				case 1:
					System.out.println("\n1.Savings Account");
					System.out.println("2.Current Account");
					System.out.print("Choose: ");
					ch = in.nextInt();
							
					switch(ch)
					{
						case 1: 
						System.out.print("\nEnter Name: ");
						name = in.nextLine();
						System.out.print("Enter Account number: ");
						accnum = in.nextInt();
						System.out.print("Enter Account Balance: ");
						balance = in.nextDouble();
						
						account acc1 = new savings(name,accnum,balance);
						menu(acc1);
						//i++;
						break;
						
						case 2: 
						System.out.print("\nEnter Name: ");
						name = in.nextLine();
						System.out.print("Enter Account number: ");
						accnum = in.nextInt();
						System.out.print("Enter Account Balance: ");
						balance = in.nextDouble();
						
						account acc2 = new current(name,accnum,balance);
						menu(acc2);
						//j++;
						break;
						
						default:
						System.out.println("Invalid option, please choose correctly");
						break;
					}
					break;
				case 2: 
				/* 
					System.out.println("1.Savings Account");
					System.out.println("2.Current Account");
					System.out.print("Choose: ");
					ch = in.nextInt();
					
					switch(ch)
					{
						case 1: choose(acc, i);
							break;
						case 2: choose(acc, j);
							break;
						default: 
							System.out.println("Invalid input");
							break;
					}
				*/
					break;
				case 3:
					break;
				
				case 4: System.exit(0);	
				default: System.out.println("Invalid input. Please try again");
					continue;
			}
		}
	}
}
