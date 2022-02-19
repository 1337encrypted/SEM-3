/*
2.3) Write a Java program to define a class Lamp. It can be in on or off state. You can turn on and turn off lamp (behavior). It makes use of class and its member methods.
*/
import java.util.Scanner;
class lamp
{
	private boolean state;
	
	public lamp()
	{
		state = false;
	}
	
	public boolean turnOn()
	{
		state = true;
		System.out.println("\nON\n");
		return state;
	}
	public boolean turnOff()
	{
		state = false;
		System.out.println("\nOFF\n");
		return state;
	}
	public void status()
	{
		if(state)
			System.out.println("\nLED is on\n");
		else
			System.out.println("\nLED is off\n");
	}
}

class Termwork23
{
	public static void main(String args[])
	{
		lamp Switch = new lamp();
		
		Scanner in = new Scanner(System.in);	
		while(true)
		{
			System.out.println("\n1.Lamp ON");
			System.out.println("2.Lamp OFF");
			System.out.println("3.Lamp STATUS");
			System.out.println("4.Exit");
			System.out.print("Choose -> ");
			
			int ch = in.nextInt();
			
			switch(ch)
			{
				case 1: Switch.turnOn();
					break;
				case 2: Switch.turnOff();
					break;
				case 3: Switch.status();
					break;
				case 4: System.exit(0);
				default: System.out.println("\nInvalid case, please choose again\n");
				continue;
			}
		}
	}
}
