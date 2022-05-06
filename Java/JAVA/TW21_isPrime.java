/*
 21) Write a Java application to implement the following:
 • PrimeTester class implements isPrime() method by iterating from 2 to n-1 for a given number n
 • ImprPrimeTester class implements isPrime() method by iterating from 2 to n/2
 • FasterPrimeTester class implements isPrime() method by iterating from 2 to
 • FastestPrimeTester class implements isPrime() method using Fermat’s Little theorem.
    o Fermat’s Little Theorem:
    o If n is a prime number, then for every a, 1 < a < n-1,
        ▪ a^n-1 % n = 1
*/

interface IsPrime
{
    boolean isPrime(int n);
}

class PrimeTester implements IsPrime
{
    @Override
    public boolean isPrime(int n)
    {
        boolean flag = true;
        for(int i=2; i<=n-1; i++)
        {
            if((n%i) == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;          
    }
}


class ImprPrimeTester implements IsPrime
{
    @Override
    public boolean isPrime(int n)
    {
        boolean flag = true;
        for(int i=2; i<=n/2; i++)
        {
            if((n%i) == 0)
            {
                flag = false;
                break;
            }
        }
        return flag;          
    }
}
class FasterPrimeTester implements IsPrime
{
    @Override
    public boolean isPrime(int n)
    {
        boolean flag=true;
        for(int i=2; i*i<n; i++)        //OR for(int i=2; i<Math.sqrt(n); i++) is the same thing (square both sides)
        {
            if((n%i)==0)
            {
                flag=false;
                break;
            }
        }
        return flag;          
    }
}


class FastestPrimeTester implements IsPrime
{
    @Override
    public boolean isPrime(int n)
    {
        int a=2;
        return (Math.pow(a,n-1)%n == 1);
    }
}

public class TW21_isPrime
{
    public static void main(String[] args)
    {
       PrimeTester p1 = new PrimeTester();
       ImprPrimeTester p2 = new ImprPrimeTester();
       FasterPrimeTester p3 = new FasterPrimeTester();
       FastestPrimeTester p4 = new FastestPrimeTester();
        
       System.out.println("32 is Prime? "+p1.isPrime(32));
       System.out.println("17 is Prime? "+p1.isPrime(17));
       System.out.println("32 is Prime? "+p2.isPrime(32));
       System.out.println("17 is Prime? "+p2.isPrime(17));
       System.out.println("32 is Prime? "+p3.isPrime(32));
       System.out.println("17 is Prime? "+p3.isPrime(17));
       System.out.println("32 is Prime? "+p4.isPrime(32));
       System.out.println("17 is Prime? "+p4.isPrime(17));
       
    }
}
