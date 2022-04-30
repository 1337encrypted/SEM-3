/*
2) A joint family consisting of 10 households lives in the same compound. Due to mounting electricity bills, 
the head (Mr. X) of the joint family decides to analyze the consumption pattern (in terms of the billed amount) of each 
household for a year. Mr. X needs access to the following information for his analysis. Write a function to find:
1) The total expenditure on electricity consumption by each household in a year.
2) The maximum and minimum electricity consumption of each household in a year.
3) The amount by which each household exceeded the average consumption (+/-) of all households in the month of June. 
4) The maximum, minimum and average electricity consumption of all households in a year.
Demonstrate how you would use a two dimensional matrix to help Mr. X.
*/

class household
{
	private final int individuals = 10;
	private final int months = 12;
	private double elecbill;
	private int data[][] = new int[individuals][months];
	private int totalExp[] = new int[10];
	private int maxExp[] = new int[10];
	private int minExp[] = new int[10];
	private double juneExp[] = new double[10];
	private int maximum[] = new int[10];
	private int minumum[] = new int[10];
	private int average[] = new double[10];

	public int count;

	public household(double ... monthlybill)
	{
		for(int j=count;j<months;j++)
			this.data[count][j] = monthlybill[j];
		count++;
	}

	public void totalExpenditure()
	{
		for(int i=0;i<individuals;i++)
			for(int j=0;j<months;j++)
				totalExp[i] += data[i][j];
	}

	public void maxMinExp()
	{
		for(int i=0;i<individuals;i++)
		{
			maxExp[i]=data[i][0];

			for(int j=1;j<months;j++)
			{
				if(maxExp[i] < data[i][j])
					maxExp[i] = data[i][j];
			}
		}

		for(int i=0;i<individuals;i++)
		{
			minExp[i]=data[i][0];

			for(int j=1;j<months;j++)
			{
				if(minExp[i] > data[i][j])
					minExp[i] = data[i][j];
			}
		}
	}

	public void june()
	{
		private int avg[] = new double[10];

		for(int i=0;i<individuals;i++)
		{
			avg[i] = (double)(totalExp[i]/individuals);
			juneExp[i] = avg[i] - (double)data[i][6];
		}
	}

	public void maxMinAll()
	{
		for(int i=0;i<individuals;i++)
			for(int j=0;j<months;j++)
			{
				maximum[i] += data[i][j];
			}
	}
	
}
