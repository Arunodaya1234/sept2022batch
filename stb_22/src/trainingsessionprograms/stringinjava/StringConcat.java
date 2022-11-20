package stringinjava;

public class StringConcat {

	public static void main(String[] args) {
		String s1="Alex";
		String s2="Broad";
		String s3=s1.concat(s2+" from America");
		System.out.println("Result:"+s3);
		
		String str="Country";
		String substr=str.substring(5);
		System.out.println("Sub string result="+substr);
		
		String str1=" sdf";
		System.out.println(str1.length());
		System.out.println(str1.isEmpty());
		System.out.println(str1.isBlank());
		
		String str2="Kava";
		System.out.println(str2.replace('K', 'J'));
		System.out.println(str2.toUpperCase());
		System.out.println(str2.toLowerCase());
		System.out.println(str.charAt(4));
		
		String str3=" Easy Solution ";
		System.out.println(str3.trim());
		
		String str4="I love Java";
		System.out.println(str4.contains("love"));
		System.out.println(str4.contains("Java"));
		System.out.println(str4.contains("india"));
		System.out.println(str4.startsWith("I "));
		System.out.println(str4.endsWith("Java"));
		String str5="Programmingr";
		System.out.println(str5.indexOf("m"));
		System.out.println(str5.lastIndexOf("r"));
		
		String str6="I love Java Programmimg";
		String s[]=str6.split(" ");
		System.out.println(s.length);
		for(int i=0;i<s.length;i++)
		{
			System.out.println(s[i]);
		}
		
	}
}
