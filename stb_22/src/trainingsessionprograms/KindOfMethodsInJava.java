package trainingsessionprograms;

public class KindOfMethodsInJava 
{
	//can be accessed through object
	void m1()
	{
		System.out.println("Instance method");
	}
	//can be accessed through class name
	static void m2()
	{
		System.out.println("Static method");
	}
	
	public static void main(String args[])
	{
		KindOfMethodsInJava obj=new KindOfMethodsInJava();
		obj.m1();
		KindOfMethodsInJava.m2();
	}
}
