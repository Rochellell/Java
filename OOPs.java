class Account{
    private long accNum;
    private double balance;
    private String accHolder;
    private double deposit, withdraw;
    public long getaccNum(){
        return accNum;
    }
    public void setaccNum(long accNum){
        this.accNum = accNum;
    }
    
    public double getbalance(){
        return balance;
    }
    public void setbalance(double balance){
        this.balance = balance;
    }
    
    public String getaccHolder(){
        return accHolder;
    }
    public void setaccHolder(String accHolder){
        this.accHolder = accHolder;
    }
    // public Account(){
    //     accNum = 12345;
    //     balance = 500.88;
    //     accHolder = "ABC";

    // }
    public double getdeposit(){
        return deposit;
    }
    public void setdeposit(double deposit){
        this.deposit = deposit;
    }
    public double getwithdraw(){
        return withdraw;
    }
    public void setwithdraw(double withdraw){
        this.withdraw = withdraw;
    }
}

class Person{
    private String name;
    private float age;
    
    // public Person(){ // constructor
        
    // }
    
    public String getname(){
        return name;
    }
    public void setname(String name){
        this.name = name;
    }
    public long getage(){
        return age;
    }
    public void setage(float age){
        this.age = age;
    }

}

public class OOPs{
    public static void main(String[] args){
        Account dep = new Account();
        dep.setdeposit(2000);        
        Account withd = new Account();
        withd.setwithdraw(2000);
      //  System.out.println(b.getbalance());
        
        
        Account b = new Account();
        b.setbalance(11.1);
        System.out.println(b.getbalance());
    //     if(b.getbalance()<500){
    //         System.out.println(b.getbalance());
    // }
        
    }
}