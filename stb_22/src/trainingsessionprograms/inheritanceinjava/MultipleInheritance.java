package inheritanceinjava;

class A
{
	int a=10;
	public void msg()
	{
		System.out.println("class A method"+a);
	}
}

class B
{
	int b=30;
	public void msg()
	{
		System.out.println("class B method"+b);
	}
}

class C extends A
{
	int c=30;
	public C()
	{
		super();
	}
	public void msg()
	{
		System.out.println("class C method"+c);
	}
}

public class MultipleInheritance {

	public static void main(String[] args) {
		A a;
		C cobj=new C();
		a=cobj;
		a.msg();
	}

}
