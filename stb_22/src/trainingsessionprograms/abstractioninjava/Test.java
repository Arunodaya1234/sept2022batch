package abstractioninjava;
import abstractioninjava.MyClass;
public class Test {

	public static void main(String[] args) {
		MyClass m=new MyClass();
		m.show();
		m.showC();
		
		Add a=new Add();
		a.m1();
		a.sum();
		Sub s=new Sub();
		s.sub();
	}

}

interface ConstantValues
{
	int x=20;
	int y=30;
}

class Add implements ConstantValues
{
	int a=x;
	int b=y;
	void m1()
	{
		System.out.println(a +" and "+b);
	}
	void sum()
	{
		int res=a+b;
		System.out.println(res);
	}
}
class Sub implements ConstantValues
{
	void sub()
	{
		int res=y-x;
		System.out.println(res);
	}
}