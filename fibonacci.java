//Take a limit and generate Fibonacci series up to the limit
public class fibonacci{
    static int fib(int n)
    {
    if (n <= 1)
        return n;
        return fib(n-1) + fib(n-2);
    }
      
    public static void main (String args[])
    {
    int n = 10; 
    int limit= 30;

    if(fib(n)> limit){
         System.out.println(fib(n) + " is over the limit " + limit);
    }
    else{
        System.out.println(fib(n) + " did not reach the limit " + limit);
    }
    }
}