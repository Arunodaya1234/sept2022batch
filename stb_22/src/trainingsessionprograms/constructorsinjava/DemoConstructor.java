package constructorsinjava;

public class DemoConstructor {
	
	//default 
	DemoConstructor()
	{
		System.out.println("Default constructor");
	}
	
	//paramterized
	DemoConstructor(int a)
	{
		this();
		System.out.println("One argument constructor");
	}
	
	DemoConstructor(float a)
	{
		this(33);
		System.out.println("One argument constructor");
	}
	
	DemoConstructor(int a,float b)
	{
		System.out.println("Two argument constructor");
	}

	public static void main(String[] args) {
		//DemoConstructor dc=new DemoConstructor();//default
		DemoConstructor dc1=new DemoConstructor(10f);
//		DemoConstructor dc2=new DemoConstructor(20,30f);

	}

}
