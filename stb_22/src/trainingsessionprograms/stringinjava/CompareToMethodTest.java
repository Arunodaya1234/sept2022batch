package stringinjava;

public class CompareToMethodTest {

	public static void main(String[] args) {
		String s1="mumbai";
		String s2="mumbai";
		String s3="ranchi";
		String s4="pune";
		String s5="";
		
		System.out.println(s1.compareTo(s2));//0---s1==s2=>0s1>s2+ve s1<s2 -ve
		System.out.println(s1.compareTo(s3));//-5
		System.out.println(s1.compareTo(s4));//-3
		System.out.println(s4.compareTo(s5));//4
	}

}
