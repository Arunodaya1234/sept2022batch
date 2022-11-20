package trainingsessionprograms;

public class Human 
{
	//class variables
	String name="Vijay";
	int weight=76;
	int age=32;
	
	public void display_human_info()
	{
		System.out.println("Name:"+name);
		System.out.println("Weight:"+weight);
		System.out.println("Age:"+age);
		
	}
	
	public static void main(String[] args) {
		int length=33;//local variable
		
		Human h1=new Human();
		Human h2=new Human();
		Human h3=new Human();
		h1.age=33;
		h2.age=58;
		h3.age=45;
		h2.name="Ajay";
		h3.weight=55;
		h1.display_human_info();
		h2.display_human_info();
		h3.display_human_info();
		System.out.println("Length:"+length);
	}

}
