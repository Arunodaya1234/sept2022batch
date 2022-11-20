package exceptionhandlinginjava;

public class NestedTryCatch {

	public static void main(String[] args) {
		String str="Hello Java";
		int x[]= {0,1,2,3,4};
		//outer try
		
		try
		{
			int strlrngth=str.length();
			System.out.println("String Length is:"+strlrngth);
			str.charAt(11);
			//nested try
			try
			{
				int y=6;
				System.out.println(x[y]);
			}
			catch(ArrayIndexOutOfBoundsException ae)
			{
				System.out.println("Array related exception"+ae.toString());
			}	
		}
		catch(NullPointerException ne)
		{
			System.out.println("Null pointer exception"+ne.toString());
		}
	}
}
