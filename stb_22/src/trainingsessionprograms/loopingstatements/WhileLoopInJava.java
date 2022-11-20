package loopingstatements;

public class WhileLoopInJava {

	public static void main(String[] args) {
		int i=1;//initialized
		while(i<=5)
		{
			System.out.println("i:"+i);
			i++;//i=i+1
		}
		System.out.println("loop will be out at i="+i);
		
		int x=5;
		while(x>=1)
		{
			System.out.println("x:"+x);//5,4,3,2,1
			x--;//x=x-1=4,3,2,1,0
		}
		System.out.println("loop will be out at x="+x);

	}

}
