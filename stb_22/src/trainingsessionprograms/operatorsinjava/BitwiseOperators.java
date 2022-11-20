package operatorsinjava;

public class BitwiseOperators {

	public static void main(String[] args) {
		int x=22;//1010
		int y=14;//1011
		System.out.println("Bitwise AND:"+(x&y));
		
//		int a=22;//1010
//		int b=14;//1011
		System.out.println("Bitwise OR:"+(x|y));
		
//		int p=22;//1010
//		int q=14;//1011
		int b=10;
		System.out.println("Bitwise NOT:"+~x);
		System.out.println("Bitwise NOT:"+~b);
		
		int a=20;
		int res=a<<3;
		System.out.println("Left Shift:"+res);
		int a1=1;
		int res1=a1>>1;
		System.out.println("Right Shift:"+res1);
		

	}

}
