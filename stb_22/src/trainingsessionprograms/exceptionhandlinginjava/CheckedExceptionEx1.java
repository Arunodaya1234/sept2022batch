package exceptionhandlinginjava;

public class CheckedExceptionEx1 {

	
	public static void main(String[] args) {
		System.out.println("Hello");
		try 
		{
			int a[]= {10,20,30};
			a[4]=60;
		} 
		catch (ArrayIndexOutOfBoundsException e) 
		{
			System.out.println("Catched Exception:"+e.getMessage());
		}
		catch(ArithmeticException e)
		{
			
		}
		finally {
			
		}
		

	}

}
