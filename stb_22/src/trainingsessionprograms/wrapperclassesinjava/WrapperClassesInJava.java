package wrapperclassesinjava;

public class WrapperClassesInJava {

	public static void main(String[] args) {
		int a=25;
		Integer awrap=new Integer(a);
		int aa=awrap;
		System.out.println("aa:"+aa);
		
		char ch='a';
		Character chwrap=new Character(ch);
		
		byte b=10;
		Byte bwrap=new Byte(b);
		byte nunwrap=bwrap.byteValue();
		
		float f=18.6f;
		Float fwrap=new Float(f);
		fwrap.floatValue();
		
		double d=456546.34d;
		Double dwrap=new Double(d);
		
		
		System.out.println(awrap);
		System.out.println(chwrap);
		System.out.println(bwrap);
		System.out.println(fwrap);
		System.out.println(dwrap);
		
//		int aunwrap=awrap.intValue();
//		System.out.println(aunwrap);
		
		
	}

}
