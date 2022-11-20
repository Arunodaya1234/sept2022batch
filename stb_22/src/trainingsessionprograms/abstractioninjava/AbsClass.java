package abstractioninjava;

public class AbsClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Substraction obj=new Substraction();
		obj.calculate(20, 10);
		//Mytest m=new Mytest();
		
	}

}

abstract class Mytest
{
	abstract void calculate(int a,int b);
	void check()
	{
		System.out.println("Concrete method");
	}
}
abstract class Addition extends Mytest
{
	abstract void test();
	void display()
	{
		System.out.println("display");
	}
}
class Substraction extends Addition
{
	void calculate(int a, int b) {
		int res=a-b;
		System.out.println(res);
	}

	@Override
	void test() {
		System.out.println("test");
		
	}
	
}