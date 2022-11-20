package constructorsinjava;

 class C {
	D b;
	C(D b)//b=d4
	{
		this.b=b;
	}
	void m3()
	{
		System.out.println(b.data);//d.data
	}
}

class E
{
	D d;
	E(D d)
	{
		this.d=d;
	}
}
public class D
{
	int data=10;
	D()
	{
		C c=new C(this);//d
		E e=new E(this);
		c.m3();
	}
	
	public static void main(String args[]) {
		D d=new D();
		D d1=new D(); 
		D d2=new D();
		D d3=new D();
		D d4=new D();
		
	}	
}
