package operatorsinjava;

public class RelationalOperatorsInJava 
{
	
	public static void main(String[] args) 
	{
		int x=10;
		int y=30;
		//boolean c=((x>y)&&(y<x));
		System.out.println("x is greater than y :"+(x>y));//false
		System.out.println("y is less than x :"+(y<x));//false
		System.out.println("Y is greater than x :"+(y>x));//true
		System.out.println("Y is less than x :"+(y<x));//false
		System.out.println("x is greater than or equal to y :"+(x>=y));//false
		System.out.println("y is greater than or equal to x :"+(y>=x));//true
		System.out.println("x is not equal to y :"+(x!=y));//true
//		System.out.println(c);
//		c=((x>y)||(y>x));
//		System.out.println(c);
	}

}
