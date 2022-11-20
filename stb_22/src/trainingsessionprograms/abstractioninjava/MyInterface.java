package abstractioninjava;

public interface MyInterface 
{
	public static final int x=10;
	int y=20;
	
	public abstract void m1();
	public abstract void m2();
}

interface A
{
	int x=10;
	int y=20;
}

interface B extends A
{
	void show();
}

interface C extends B
{
	void showC();
}

class MyClass implements C
{

	public void show() {
		System.out.println(x);
		
	}

	public void showC() {
		System.out.println(y);
		
	}
}


