class P2 
{
	int a =10;
	
	public void m1() 
	{
		System.out.println("a from P2 " +a);
	}
	
	public void common()
	{
		System.out.println("same");
	}
}

class C2 extends P2 {
	int a = 100;
	
	public void m2() 
	{
		System.out.println("a from c2 " +a);
	}
	
	public void common()
	{
		System.out.println("we're not the same");
	}
}

public class TestInheritance3 {
	
	public static void main(String[] args) 
	{
		//case 1 (P -> P)
		P2 parent1 = new P2();
		System.out.println(parent1.a);
		parent1.m1();
//		parent1.m2(); ERROR - parent can't access child's method
		
		//case 2 (C -> C)
		C2 child1 = new C2();
		child1.m2();
		System.out.println(child1.a);
		
		//case 3 (P -> C)
		P2 parent2 = new C2();
		parent2.m1();
//		parent2.m2(); ERROR - parent can't access child's method, NO EXISTENCE of child at COMPILE
		System.out.println(parent2.a); //output? (compile, a = 10)
		parent2.common(); //parent (compile), programs runs, now it recognizes common method has same name so now child method runs
		// ^ Runtime Polymorphism <-> Late/Dynamic Binding ^
		
		//DownCasting
		
		

	}
}