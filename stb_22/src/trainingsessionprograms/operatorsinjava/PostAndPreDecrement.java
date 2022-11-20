package operatorsinjava;

public class PostAndPreDecrement {

	public static void main(String[] args) {
//		int a=10;
//		int b=--a;//9
//		System.out.println("A:"+a+" and B:"+b);
//		int x=1;
//		System.out.println(x);
//		System.out.println(--x);
//		System.out.println(x);
//		System.out.println(x--);
//		System.out.println(x);
		int a=1;
		++a;//2
		int b=a++;//b=2a=3
		a--;//a=2
		int c=--a;//a=1
		int d=a*10/(b-c);//10/1=10
		System.out.println("a:"+a);//1
		System.out.println("d:"+d);//10
	}

}
