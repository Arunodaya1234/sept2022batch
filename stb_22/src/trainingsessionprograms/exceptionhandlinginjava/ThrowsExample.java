package exceptionhandlinginjava;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ThrowsExample {

	public static void main(String[] args) throws InterruptedException {
//		Thread.sleep(2000);
//		System.out.println("Hi");
//		
		ThrowsTest tt=new ThrowsTest();
		try {
			tt.accept();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		tt.display();

	}

}

class ThrowsTest
{
	private String fname,lname;
	void accept() throws IOException
	{
		InputStreamReader sr=new InputStreamReader(System.in);
		BufferedReader br=new BufferedReader(sr);
		System.out.println("Enter fname");
		fname=br.readLine();
		System.out.println("Enter lname");
		lname=br.readLine();	
	}
	void display()
	{
		System.out.println(lname+" and "+fname);
	}
}
