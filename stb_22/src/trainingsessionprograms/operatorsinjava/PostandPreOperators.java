package operatorsinjava;

public class PostandPreOperators {

	public static void main(String[] args) {
//		int x=50;
//		int y=100;
//		int z=200;
//		
//		int a,b,c;
//		a=++x;//51
//		b=y++;//100
//		System.out.println("a:"+a);//51
//		System.out.println("b:"+b);//
//		c=x+y++ + ++z;//51+101+201=353
//		System.out.println("c:"+c);//
//		int xx=10;
//		int mm=++xx*xx++;
//		System.out.println("mm:"+mm);
		int p=20;
		int q=++p*10/p++ + ++p;
		System.out.println("p:"+p);//23
		System.out.println("q:"+q);//33
	}

}
