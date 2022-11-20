package exceptionhandlinginjava;

import java.util.Scanner;


public class MultiCatch {

	public static void main(String[] args) {
		try
		{
			int arr[]=new int[5];//[0,0,0,0,0]
			arr[3]=20/2;
			Scanner s=new Scanner(System.in);
			System.out.println("Enetr value of b:");
			int b=s.nextInt();
		}
		catch(ArithmeticException e)
		{
			System.out.println("A number cannot divide by zero"+e.getMessage());
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println("Accessing/storing element outside of limit"+e.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getLocalizedMessage());
		}
	}

}
