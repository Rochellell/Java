package anon;

abstract class Computer{
    public abstract void sayHello();
    public abstract void printComputer();
    
}
class Mouse{
    public void print(Computer c){ 
        System.out.println("within print");
        c.printComputer(); // abstract method
        c.sayHello();
    }
}
public class TestAnonymous{
    public static void main(String[] args){
        Mouse m = new Mouse();
        
        m.print(new Computer(){ // anonymous 
            @Override
            public void printComputer(){// in the abstract class
                System.out.println("printcomputer");
            }
            @Override
            public void sayHello(){
                System.out.println("sayHello");
            }            
        });

}
}

