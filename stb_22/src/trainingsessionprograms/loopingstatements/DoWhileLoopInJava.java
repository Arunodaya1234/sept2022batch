package loopingstatements;

public class DoWhileLoopInJava {

	public static void main(String[] args) {
		int i=1;
		do
		{
			System.out.println("i:"+i);//1,2,3,4,5
			i=i+1;//i++=2,3,4,5,6
		}
		while(i<=5);
		System.out.println("Loop exit at i="+i);
		
		int ii=1;//initialized
		while(ii<=5)
		{
			System.out.println("ii:"+ii);
			ii++;//i=i+1
		}
		System.out.println("loop will be out at ii="+ii);

	}

}
