package localinner;

class Outer{
        int a_outer =10;
        public void m1_Outer(){
            System.out.println("Outer" + a_outer);

         }

     class Inner{
         int x_inner=20;
         public void m2_Inner(){
             
            System.out.println("Inner" + x_inner);
            System.out.println("Inner" + a_inner);

         }
         Inner i = new Inner();
         i.m2_Inner();
     }
}
public class LocalInner{
    public static void main(String[]args){

        Outer out = new Outer();
        out.m1_Outer();
    }
}


package localinner;
class Computer{
    int x=100;
    public void Outer() {
    System.out.println("Computer: "+ x);
    }


  class HardDisk{
      int y=20;
        public void Inner() {
        System.out.println("HardDisk: "+ y);
        }
    // Computer.HardDisk m = com.new HardDisk(); 
    // m.Inner();// calling inner method

  }
  
}

public class Main {
  public static void main(String[] args) {
    Computer com = new Computer();// Outer obj
    com.Outer();
    Computer.HardDisk m = com.new HardDisk(); 
    m.Inner();// calling inner method

    
  }
}








public class Outerclass {
   // instance method of the outer class 
   void my_Method() {
      int num = 23;

      // method-local inner class
      class MethodInner_Demo {
         public void print() {
            System.out.println("This is method inner class "+num);     
         }   
      } // end of inner class
       
      // Accessing the inner class
      MethodInner_Demo inner = new MethodInner_Demo();
      inner.print();
   }
   
   public static void main(String args[]) {
      Outerclass outer = new Outerclass();
      outer.my_Method();           
   }
}