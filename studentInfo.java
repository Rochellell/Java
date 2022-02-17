//Create different object for every student
class Student{
	int id;
	String name;
	String subject;
	static String university = " AAA University";

	public Student(int ID, String name, String subject){
		this.id = ID;
		this.name = name;
		this.subject = subject;
	}

}

public class studentInfo{
	public static void main(String[] args){
		Student s1 = new Student(111, "John", "Math");
		System.out.println(s1.name + " is attending " + s1.university + " university.");
		Student s2 = new Student(112, "Amy", "English");
		System.out.println(s2.name + "'s student ID number is " + s2.id + ".");
	}
}