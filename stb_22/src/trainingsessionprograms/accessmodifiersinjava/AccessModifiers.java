package accessmodifiersinjava;

class AB
{
	private int data=40;
	
	private void msg()
	{
		System.out.println("Private method"+data);
	}
	
	void display()
	{
		msg();
		System.out.println("Hello");
	}
}

class BC
{
	int b=30;
	void method1()
	{
		System.out.println("Deafult modifiers"+b);
	}
}

class BCD extends BC
{
	
}

public class AccessModifiers {
	public static void main(String[] args) {
		AB a=new AB();
		a.display();
		BC b=new BC();
		b.method1();
		BC bc=new BC();
		
	}

}
