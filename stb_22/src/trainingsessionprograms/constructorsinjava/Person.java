package constructorsinjava;

public class Person 
{
	String name;
	int age;
	String address;
	float weight;
	
	public Person(String pname,int page,String paddress,float pweight)
	{
		name=pname;
		age=page;
		address=paddress;
		weight=pweight;
	}
	
	public void display()
	{
		System.out.println(name);
		System.out.println(address);
		System.out.println(age);
		System.out.println(weight);
	}
	
	public static void main(String[] args) {
		Person p=new Person("Vishal",34,"Pune",66.78f);
		p.display();

	}

}
