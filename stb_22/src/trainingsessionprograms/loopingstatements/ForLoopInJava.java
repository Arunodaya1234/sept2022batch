package loopingstatements;

public class ForLoopInJava {

	public static void main(String[] args) {
		int i;
		for(i=1;i<=5;i++)//2,3,4,5,6
		{
			System.out.println("i:"+i);//1,2,3,4,5
		}
		System.out.println("Loop exited at i="+i);
		
		for(int a=5;a>=1;a--)
		{
			System.out.println("a:"+a);
		}

	}

}
