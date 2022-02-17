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
  }
}

public class ComHardDisk {
  public static void main(String[] args) {
    Computer com = new Computer();
    Computer.HardDisk m = com.new HardDisk();
    m.Inner();// calling inner method
    
    com.Outer();
  }
}