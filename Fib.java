// ******************************************************************
//   Fib.java
//
//   A utility class that provide methods to compute elements of the
//   Fibonacci sequence.
// ******************************************************************
public class Fib
{

    //--------------------------------------------------------------
    // Recursively computes fib(n)
    //--------------------------------------------------------------
    public static int fib1(int n)
    {
        //Fill in code -- this should look very much like the
        //mathematical specification
        //System.out.println("Making call fib1("+n+")");
        if(n<=1)
            return n;
        else 
            return fib1(n-1) + fib1(n-2);
    }

    public static int fib2(int n)
    {
        int [] arr = new int[n];
        for(int x=0;x<n;x++){
            if(x<=1)
                arr[x] = x;
            else
                arr[x] = arr[x-1] + arr[x-2];
        }
        if(n<=1)
            return n;
        else
            return arr[n-1] + arr[n-2];
    }
}