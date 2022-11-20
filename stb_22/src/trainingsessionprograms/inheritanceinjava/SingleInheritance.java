package inheritanceinjava;

class BaseClass
{
	BaseClass()
	{
		
	}
	public static void baseClassFeatures()
	{
		System.out.println("baseClass Feature 1");
		System.out.println("baseClass Feature 2");
	}
}

class BaseClass1
{
	void baseClassFeatures()
	{
		System.out.println("baseClass Feature 1");
		System.out.println("baseClass Feature 2");
	}
}

class DerivedClass extends BaseClass
{
	void derivedClassFeatures()
	{
		System.out.println("derivedClass Feature 1");
		System.out.println("derivedClass Feature 2");
	}
}
class DerivedClass1 extends DerivedClass
{
	void derivedClassFeatures()
	{
		System.out.println("derivedClass Feature 1");
		System.out.println("derivedClass Feature 2");
	}
}


public class SingleInheritance {

	public static void main(String[] args) {
		
		DerivedClass derivedClass=new DerivedClass();
		derivedClass.baseClassFeatures();
		derivedClass.derivedClassFeatures();
		A a=new A();
		a.
	}

}
