package trainingsessionprograms;

public class Methods_In_Java {
	int no=4;
	//defalt method or method without parameter
	public void find_square()
	{
		int result=no*no;
		System.out.println("Square root of :"+no+"is:"+result);
	}
	
	//method with parameter and return type
	public float find_square_of_no(float a,int b,int c)
	{
		return a*a;
		
	}
	public static void main(String[] args) {
		Methods_In_Java obj=new Methods_In_Java();
		obj.find_square();
		System.out.println("Square is:"+obj.find_square_of_no(5.8f,6,7));
	}

}
