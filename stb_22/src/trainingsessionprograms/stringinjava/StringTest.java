package stringinjava;

public class StringTest {

	public static void main(String[] args) {
		String name="Robert";
		String city=new String("Pune");
		char arr[]= {'I','N','D','I','A'};
		String country=new String(arr);
		
		System.out.println(name);
		System.out.println(city);
		System.out.println(country);
		
		String newString=name.concat(country);
		System.out.println(name);
		System.out.println(newString);
		
		String str="Hello Java";
		boolean result=str.equals("Hello Java");
		boolean result1=str.equalsIgnoreCase("hello java");
		System.out.println(result);
		System.out.println(result1);

	}

}
