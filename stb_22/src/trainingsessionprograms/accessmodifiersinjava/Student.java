package accessmodifiersinjava;

class FinalMethod
{
	FinalMethod()
	{
		System.out.println("Default constructor");
	}
	final int x=50;
	void show()
	{
		System.out.println(x);
	}
}

class Test extends FinalMethod
{
	void show()
	{
		
	}
}

public class Student {
	
	final float pi=3.14f;
	final static int rollno=30;
	int x=10;
	public static void main(String[] args) {
		final int b=2;
		Student s=new Student();
		
	}

}
