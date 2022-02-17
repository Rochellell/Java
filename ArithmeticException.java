/*ArithmeticException.java:10: error: incompatible types: ArithmeticException cannot be converted to Throwable
      catch(ArithmeticException e){
            ^
1 error
*/
public class ArithmeticException
{
   public static void main(String args[])
   {
      int m=100, n=0;
      try{
         int result= m / n ;
         System.out.println ("Result: "+ result);
      }
      catch(ArithmeticException e){
         System.out.println ("m shouldn't divided by zero");
      }
   }
}