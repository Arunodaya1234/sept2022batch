package trainingsessionprograms;

class Person 
{
	//variables declaration---properties/states
	float weight=67f;
	int nose=1;
	double salary=5678678.8989d;
	//method declaration
	public void walking()
	{
		System.out.println("Person can walk");
	}
	public String listening()
	{
		return "Person can listen";
	}	
}

public class ClassSkeleton
{
	public static void main(String args[])
	{
		Person p1;
		Person p2=new Person();
		Person p3=new Person();
		Person p4=new Person();
		p2.weight=44;
		System.out.println(p2.weight);
		String result=p2.listening();
		System.out.println(result);
	}
}
