package exceptionhandlinginjava;

import javax.management.RuntimeErrorException;

public class ThrowExample {

	public static void main(String[] args) {
//		try
//		{
////			ArithmeticException ae=new ArithmeticException();
////			throw ae;
//			throw new ArithmeticException();
//			//System.out.println("After exception");
//		}
//		catch(ArithmeticException a)
//		{
//			System.out.println("Caught:Arithmetic Exception"+a.getMessage());
//		}
		int num=1;
		for(num=1;num<=10;num++)
		{
			try
			{
				if(num==5)
				{
					throw new ArithmeticException("Arithmatic");
				}
				else if(num<2)
				{
					throw new RuntimeException("Runtime");
				}
				else if(num>9)
				{
					throw new NullPointerException("Nullpointer");
				}
			}
			catch(ArithmeticException ae)
			{
				System.out.println("Caught:ArithmeticException");
			}
			catch(NullPointerException ne)
			{
				System.out.println("Caught:RuntimeException");
			}
			catch(RuntimeException re)
			{
				System.out.println("Caught:RuntimeException");
			}
			
		}

	}

}
