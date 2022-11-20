package constructorsinjava;

public class Student {
	String name;
	int rollno;
	
	Student(String name,int rollno)
	{
		this.name=name;
		this.rollno=rollno;
	}
	public void m1()
	{
		System.out.println("method 1");
	}
	
	public void diplay()
	{
		m1();
		System.out.println(name);
		System.out.println(rollno);
	}

	public static void main(String[] args) {
		
		Student s1=new Student("Arnav",101);
		s1.name="Vijay";
		s1.diplay();
	}

}
