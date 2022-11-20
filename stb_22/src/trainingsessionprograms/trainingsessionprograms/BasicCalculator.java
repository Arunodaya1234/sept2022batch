package trainingsessionprograms;

public class BasicCalculator 
{
	int a=33;
	int b=22;
	
	//addition
	public void add(int x,int y)
	{
		int result=x+y;
		System.out.println("Addition is :"+result);
	}
	
	//substraction
	public void sub() 
	{
		int result = a - b;
		System.out.println("Substraction is :" + result);
	}
	
	// Multiplication
	public void mul() 
	{
		int result = a * b;
		System.out.println("Multiplication is :" + result);
	}

	// Division
	public void div() 
	{
		int result = a / b;
		System.out.println("Division is :" + result);
	}
	public static void main(String[] args) 
	{
		BasicCalculator obj=new BasicCalculator();
		obj.add(11,22);
		obj.sub();
		obj.mul();
		obj.div();
	}

}
