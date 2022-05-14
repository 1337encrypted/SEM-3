/*
25) Design a class to implement Stack data structure. The method push() throws a custom exception called OverflowException if
the item cannot by pushed on to the stack. The method pop() throws a custom exception called UnderflowException if the stack
is empty. Design two classes OverflowException and UnderflowException that extend the Exception class and override the
getMessage() method. Develop a driver class to demonstrate the working of the custom exceptions by instantiating an object
of Stack class and performing push() and pop() operations.
*/

class myStack{
    int data[],top;
    myStack(int n)
    {
        data = new int[n];
        top = -1;
    }
    void push(int x)
    {
        try
        {
            if(isFull())
            {
                throw new OverFlowException("Stack Overflow");
            }
        }
        catch (OverFlowException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e + "\n");
        }
        System.out.println("Element pushed is: " + x);
        data[++top] = x;
    }
    
    int pop()
    {
        try
        {
            if(isEmpty())
            {
                throw new UnderFlowException("Stack Underflow");
            }
        }
        catch (UnderFlowException e)
        {
            System.out.println(e.getMessage());
            System.out.println(e + "\n");
        }
        return data[top--];
    }
    boolean isEmpty()
    {
        return top == -1;
    }
    boolean isFull()
    {
        return top == data.length-1;
    }
}
class OverFlowException extends Exception
{
    OverFlowException(String e)
    {
        super(e);
    }
    public String toString()
    {
        return "OverFlow Exception";
    }
}
class UnderFlowException extends Exception
{
    UnderFlowException(String e)
    {
        super(e);
    }
    public String toString()
    {
        return "UnderFlow Exception";
    }
}
 class TW25_StackOverflowException
{
    public static void main(String[] args) {
        myStack s = new myStack(4);
        s.push(10);
        s.push(20);
        s.push(30);
        s.push(40);
        s.push(60);
        System.out.println("The popped element is: " + s.pop());
        System.out.println("The popped element is: " + s.pop());
        System.out.println("The popped element is: " + s.pop());
        System.out.println("The popped element is: " + s.pop());
        System.out.println("The popped element is: " + s.pop());
    }
}
