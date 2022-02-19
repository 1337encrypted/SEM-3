/*
5a) Write a program to demonstrate the implementation of method overloading.
5.1) Create a Stack class having an integer array say elem and top_of_stack as instance variables. Define three overloaded methods having the following signatures:

a. initStack(int size) to create an array of specified size and initialize the top_of_stack
b. initStack(Stack another) to intialize the Stack object with state of the Stack object &quot;another&quot;
c. initStack(int [] a) to initialize contents of a[] to the instance variable elem. Write following methods:

a. push(): Pushes the element onto the stack,
b. pop(): Returns the element on the top of the stack, removing it in the process, and
c. peek(): Returns the element on the top of the stack, but does not remove it.

Also write methods that check whether stack is full and stack is empty and return boolean
value true or false appropriately.
*/
import java.util.Scanner;
class _stack
{
	private int stack[], top;
	
	
	public void initStack(int size)
	{
		this.stack = new int[size];
		this.top = -1;
		System.out.println("Stack is initilized");
	}
	
	public void initStack(_stack another)
	{
		this.stack = another.stack;
		this.top = another.top;
		System.out.println("Stack object copied");
	}
	
	public void initStack(int a[])
	{
		this.stack = new int[a.length];
		for(int i:a)
			push(i);
		System.out.println("Stack is copied");
	}
	
	public boolean isEmpty()
	{
		if(top == -1)
			return true;
		else
			return false;
	}
	
	public boolean isFull()
	{
		if(top == stack.length-1)
			return true;
		else
			return false;
	}
	
	public int push(int item)
	{
		if(isFull())
		{
			System.out.println("Stack overflow");
			return -1;
		}
		stack[++top] = item;
		System.out.println("Item "+item+" pushed successfully");
		return 0;
	}
	
	public int pop()
	{
		if(isEmpty())
		{
			System.out.println("Stack underflow");
			return -1;
		}
		return stack[top--];
	}
	
	public int peek()
	{
		if(top == -1)
		{
			System.out.println("Stack underflow");
			return -1;
		}
		return stack[top];
	}
	public void display()
	{
		for(int i=0;i<stack.length;i++)
			System.out.println(stack[i]);
	}
}

class Termwork5a1
{
	public static void main(String args[])
	{
		int tmp;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of the stack: ");
		int size = in.nextInt();
		_stack s1 = new _stack();
		s1.initStack(size);
		
		while(true)
		{
			System.out.println("1.Push");
			System.out.println("2.Pop");
			System.out.println("3.Peek");
			System.out.println("4.isEmpty");
			System.out.println("5.isFull");
			System.out.println("6.Display Stack");
			System.out.println("7.Exit");

			tmp = in.nextInt();

			switch(tmp)
			{
				case 1: System.out.println("Enter the item to be pushed");
					int item = in.nextInt();
					s1.push(item);
					break;
				case 2: System.out.println("Item popped"+s1.pop());
					break;
				case 3: System.out.println("Top element"+s1.peek());
					break;
				case 4: if(s1.isEmpty())
						System.out.println("Stack is empty");
					else
						System.out.println("Stack is not empty");
					break;
				case 5: if(s1.isFull())
						System.out.println("Stack is full");
					else
						System.out.println("Stack is not full");
					break;
				case 8: s1.display();
					break;
				case 7: System.exit(0);
				default: System.out.println("Invalid input, please tyy again");
					continue;
			}
		}
	}
}
