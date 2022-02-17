package staticinner;
import static staticinner.Outer.*;
import static java.lang.Math.sqrt;

class Outer{
        int a_outer =10;
        static int b =100;
        public void m1_Outer(){
            System.out.println("Outer" + a_outer);

         }
         static class Inner{
         int x_inner=20;
         public void m2_Inner(){
            System.out.println("Inner" + x_inner);
            System.out.println("static member of outer class" + b);

         }
     }
}
public class StaticInner{
    public static void main(String[]args){
        Inner oin = new Inner();
        oin.m2_Inner();
        
        Outer.Inner out = new Outer.Inner();
        out.m2_Inner();
        
        System.out.println(Math.sqrt(4));
        System.out.println(sqrt(4));

    }
}