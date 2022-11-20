package constructorsinjava;

public class B {
	int data=10;
	public void m1(B b)
	{
		System.out.println("m1 method is called");
	}
	public void m2()
	{
		m1(this);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		B c=new B();
		c.m2();

	}

}
