//Constructor overloading write a calculator class
class Calculator{

	private int num1,num2;

	public void input(){ // method
	    num1 = 1;
	    num2 = 3;
	   
	}
	public Calculator(){ // constrcutor
		num1=1;
		num2=1;
	    
	}
	public Calculator(int num1,int num2){
		this.num1 = num1;
		this.num2 = num2;
	}
	public int add(){
		return num1 + num2;
	}

}
public class TestCalculator{

	public static void main(String[] args){
		Calculator c = new Calculator();
		c.input();
		System.out.println(c.add());



	}
}
