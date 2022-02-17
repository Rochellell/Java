package staticinner;

class Computer{
        static int n=5;
        static int m =100;
        public void mOut(){
            System.out.println("Total computer: " + m);

         }
    static class Mouse{
         public void nInner(){
            System.out.println("Total mouse: " + n);

         }
     }
}
public class StaticComputerMouse{
    public static void main(String[]args){
      
        Computer.Mouse in = new Computer.Mouse();
        in.nInner();
        Computer out = new Computer();
        out.mOut();
        
    }
}