package exceptionhandlinginjava;

public class FinallyBlockExample {

	public static void main(String[] args) {
		int a=20,b=0;
		try
		{
			int sum=a/b;
			System.out.println(sum);
		}
		catch(ArithmeticException e)
		{
			System.out.println(e.toString());
		}
		finally
		{
			System.out.println("Finally must be executed");
		}
		
		System.out.println("After finally");
	}

}
