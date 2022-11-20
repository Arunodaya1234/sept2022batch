package polymorphism;

class Base
{
	void m1()
	{
		System.out.println("m1 from Base class");
	}
}

class Derived extends Base
{
	void m1()
	{
		System.out.println("m1 from Derived class");
	}
}

public class DynamicPoly {

	public static void main(String[] args) {
//		Base b=new Base();
//		b.m1();
//		Derived obj=new Derived();
//		obj.m1();
		Base b1=new Derived();
		b1.m1();
	}

}
