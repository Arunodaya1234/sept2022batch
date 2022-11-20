package constructorsinjava;

public class ThisDemo1 {
	public void msg()
	{
		System.out.println(this);
	}
	

	public static void main(String[] args) {
		
		ThisDemo1 td=new ThisDemo1();
		ThisDemo1 obj2=new ThisDemo1();
		System.out.println(td);
		td.msg();
		
		System.out.println(obj2);
		obj2.msg();
		
	}

}
