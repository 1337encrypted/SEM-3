/*
22). Write a JAVA program which has: i. An Interface class for Stack Operations (viz., push(), pop(), peek(),display()) ii. A Class that implements the Stack Interface and creates a fixed length Stack. iii. A Class that implements the Stack Interface and creates a Dynamic Length Stack. iv. A Class that uses both the above Stacks through Interface reference and does the Stack operations that demonstrates the runtime binding. 
*/

interface stackop 
{
    void push(int item);
    int pop();
}
class FixedStack implements stackop 
{
    private int stk[ ]; 
    private int top; 
    FixedStack(int size)
    { 
        stk=new int[size];
        top=-1; 
    } 
    public void push(int item)
    { 
        if(top==stk.length-1) 
        {
            System.out.println("Stack Overflows");
            int t[ ]=new int[stk.length * 2];
            for(int i=0;i<stk.length;i++)
                t[i]=stk[i];
            stk=t; 
            stk[++top]=item;
        }
        else stk[++top]=item;
    }
    public int pop()
{ 
    if(top<0)
    {
        System.out.println("Stack Underflows");
        return 0;
    }
    else return stk[top--];
} 
}
class DynStack implements stackop 
{
    private int stk[ ];
    private int top;
    DynStack(int size) 
    {
        stk=new int[size];
        top=-1;
    }
    public void push(int item)
    {
        if(top==stk.length-1)
        {
            System.out.println("Stack Overflows.");
            int t[ ]=new int[stk.length * 2];
            for(int i=0;i<stk.length;i++)
                t[i]=stk[i];
            stk=t;
            stk[++top]=item;
        }
	else
            stk[++top]=item;
    }
    public int pop()
    {
        if(top<0)
        {
            System.out.println("Stack Underflows.");
            return 0;
        }
        else return stk[top--];
    }
}
class TW22_InterfaceStack
{
    public static void main(String args[])
    {
        FixedStack fs=new FixedStack(3);
        DynStack ds=new DynStack(5);
        stackop mystk;
        for(int i=0;i<3;i++)
            fs.push(i);
        System.out.println("Fixed length Stack Contents are."); 
        for(int i=0;i<3;i++)
            System.out.println(fs.pop());
        for(int i=0;i<7;i++)
            ds.push(i);
        System.out.println("Dynamic length Stack Contents are");
        for(int i=0;i<7;i++)
		System.out.println(ds.pop());
        mystk=fs;
        for(int i=0;i<3;i++) 
            mystk.push(i); 
        System.out.println("Fixed length Stack Contents using interface reference");
        for(int i=0;i<3;i++) 
            System.out.println(mystk.pop());
        mystk=ds;
        for(int i=0;i<7;i++) 
            mystk.push(i);
        System.out.println("Dynamic length Stack Contents using interface reference");
        for(int i=0;i<7;i++)
            System.out.println(mystk.pop());
    }
}