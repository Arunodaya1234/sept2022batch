package arraysinjava;

import java.util.Scanner;

public class ScannerClass {

	public static void main(String[] args) {
		int a;
		int b;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter value of a:");
		a=input.nextInt();
		System.out.println("Eneter value of b:");
		b=input.nextInt();
		
		int c=a+b;
		System.out.println("Result:"+c);
		
	
	}

}
