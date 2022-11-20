package exceptionhandlinginjava;

public class TryCatchEx {

	public static void main(String[] args) {
		System.out.println("11");
		System.out.println("Before divide");
		try
		{
			int x=1/0;
			System.out.println("After exception");
			System.out.println("After exception");
			System.out.println("After exception");
			System.out.println("After exception");
		}
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot be divide by zero");
		}
		System.out.println("After divide");
		System.out.println("22");

	}

}
