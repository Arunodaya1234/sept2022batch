package exceptionhandlinginjava;

import java.util.Scanner;

public class MultiCatchEx2 {

	public static void main(String[] args) {
		int x,y;
		Scanner sc=new Scanner(System.in);
		try
		{
			System.out.println("Enter value of x:");
			x=sc.nextInt();
			System.out.println("Enter value of y:");
			y=sc.nextInt();
			
			int z=x/y;
			System.out.println(z);
		}
		catch(ArithmeticException ae) 
		{
			System.out.println("Exception thrown"+ae);
		}
		catch(NumberFormatException ne) 
		{
			System.out.println("Exception thrown"+ne);
		}
		catch(RuntimeException re)
		{
			System.out.println("Exception thrown"+re);
		}
	}

}
