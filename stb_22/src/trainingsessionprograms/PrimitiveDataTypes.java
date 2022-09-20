package trainingsessionprograms;

public class PrimitiveDataTypes 
{

	public static void main(String[] args) 
	{
		Long a=100L;//8 bit or 1 byte
		System.out.println("The value of byte a :"+a);
		System.out.println("Size of Byte:"+(Byte.SIZE/8)+"byte");
		short b=400;//16bit or 2 bytes
		System.out.println("Size of Short:"+(Short.SIZE/8)+"byte");
		int c=500;//32bit or 4bytes
		System.out.println("Size of int:"+c+" "+(Integer.SIZE/8)+"byte");
		long d=400L;//64bit or 8byte
		System.out.println("Size of Long:"+d+" "+(Long.SIZE/8)+"byte");
		calculate_distance();
		calculate_distance1();
	}
	
	public static void calculate_distance()
	{
		int second=60*24*60*60;
		int lightspeed=186384;
		int distance=lightspeed*second;
		System.out.println("The distance is:"+distance);
	}
	
	public static void calculate_distance1()
	{
		long second=60*24*60*60;
		long lightspeed=186384;
		long distance=lightspeed*second;
		System.out.println("The distance is:"+distance);
	}

}
