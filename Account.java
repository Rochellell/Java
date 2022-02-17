class TestAccount{
	private int acno;
	private double acbal;

	public void setAcNo(int acno){  // set method
		this.acno = acno;
	}
	public void setAcBal(int acbal){ // validation, to check is the condition is satisfied
		if (acbal>0){
		this.acbal = acbal;
	}
	}

	public int getAcNo(){  // get method
		return acno;
	}

	public double getAcBal(){
		return acbal;
	}

	public void deposit(int amt){
		acbal += amt;
	}
	public void withdraw(int amt){
		acbal -= amt;
	}
	public void display(){
		System.out.println("Account number is" + acno);
		System.out.println("Account balance is" + acbal);

	}
}

public class Account{
	public static void main(String[] args){
		Account acc = new Account();
		acc.deposit(1000);
		acc.withdraw(10);
		System.out.println(acc.get(acbal));

	}

}

