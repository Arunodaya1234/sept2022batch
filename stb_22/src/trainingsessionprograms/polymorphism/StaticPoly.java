package polymorphism;

public class StaticPoly {
	void sum(int a,int b)
	{
		int res=a+b;
		System.out.println("Sum of two nos:"+res);
	}
	
	void sum(int x,int y,int z)
	{
		int res=x+y+z;
		System.out.println("Sum of 3 nos:"+res);
	}
	
	void sum(float a,float b)
	{
		float res=a+b;
		System.out.println("Sum of two floats:"+res);
	}
	void sum()
	{
		System.out.println("Default method");
	}

	public static void main(String[] args) {
		
		StaticPoly obj=new StaticPoly();
		obj.sum();
		obj.sum(12.4f,77.0f);
	}

}
