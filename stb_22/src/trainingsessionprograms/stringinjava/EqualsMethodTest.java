package stringinjava;

public class EqualsMethodTest {

	public static void main(String[] args) {
		String s1="Hello";
		String s2="Hello";
		String s3=new String("Good bye");
		String s4=new String("Hello");
		
		System.out.println(s1.equals(s2));//true
		System.out.println(s1.equals(s3));//false
		System.out.println(s1.equals(args));//false
		System.out.println(s1.equals(null));//false
		
		if(s1.equals(s4))//true
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Not equal");
		}

	}

}
