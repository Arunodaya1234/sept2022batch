package constructorsinjava;

public class DefaultConstructor 
{
	int a=20;
	float b;
	double c;
	String name;
	boolean bValue;
	
	public DefaultConstructor()
	{
		a=10;
		b=3.4f;
		c=6465476476.09890809d;
		name="Akash";
		bValue=true;
	}
	
	public void show()
	{
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(name);
		System.out.println(bValue);
	}
	
	
	public static void main(String[] args) 
	{
		DefaultConstructor obj=new DefaultConstructor();
		obj.show();
	}

}
