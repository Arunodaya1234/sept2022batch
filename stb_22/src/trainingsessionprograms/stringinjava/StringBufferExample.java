package stringinjava;

public class StringBufferExample {

	public static void main(String[] args) {
		StringBuffer sb=new StringBuffer();
		int len=sb.length();
		int capacity=sb.capacity();
		System.out.println("Lenght and capacity of default constructor:"+len+" and "+capacity);
		sb.append("Java Prohraming language");
		System.out.println("Lenght and capacity of default constructor:"+sb.length()+" and "+sb.capacity());
		sb.append("Welcome to the world of automation");
		System.out.println("Lenght and capacity of default constructor:"+sb.length()+" and "+sb.capacity());
		System.out.println(sb);
		
		sb.setLength(120);
		System.out.println(sb.charAt(5));
		sb.setCharAt(5,'p');
		System.out.println(sb);
		
		char[] c=new char[9];
		sb.getChars(0, 8, c, 0);
		for(int i=0;i<c.length;i++) {
			System.out.print(c[i]+" ");
		}
		
		System.out.println(sb.insert(2, 'b'));
		System.out.println(sb);
		System.out.println(sb.delete(2, 6));
		System.out.println(sb.charAt(0));
		
		StringBuffer sb1=new StringBuffer("ABCDEFGH");
		System.out.println(sb1);
		sb1.reverse();
		System.out.println(sb1);
	}
	

}
