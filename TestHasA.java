
class Address {
	
	private String city;
	private String country;
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	

}

class Student {
	int id;
	String name;
	Address add; //HAS -A relation
	
	public Student() {
		id=11;
		name="sarika";
		add=new Address();
		add.setCity("LA");
		add.setCountry("US");
	}
	
	public Student(int id, String name,Address  add) {
		this.id=id;
		this.name=name;
		this.add=add;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getAdd() {
		return add;
	}

	public void setAdd(Address add) {
		this.add = add;
	}
	
	
	

}


public class TestHasA {

	public static void main(String[] args) {
		Address ad=new Address();
		ad.setCity("NY");
		ad.setCountry("USA");
		
		Student s1=new Student();
		
		System.out.println(s1.getId()+" "+s1.getName());
		System.out.println(s1.getAdd().getCity()+" "+s1.getAdd().getCountry()); // aggregation
		
		
		
		Student s2=new Student(111,"AAA",ad);
		System.out.println(s2.getId()+" "+s2.getName());
		System.out.println(s2.getAdd().getCity()+" "+s2.getAdd().getCountry()); 
		
		Student s3=new Student();
		s3.setId(112);
		s3.setName("BBB");
		s3.setAdd(ad);

		System.out.println(s3.getId()+" "+s3.getName());
		System.out.println(s3.getAdd().getCity()+" "+s3.getAdd().getCountry());
	}

}

