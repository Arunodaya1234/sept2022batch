package arraysinjava;

public class SingleDArray {

	public static void main(String[] args) {
		int a[]=new int[5];
		char b[]= {'A','B','C'};
		System.out.println(a.length);
		System.out.println("Length of array b:"+b.length);
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
		//a[5]=60;
		int len=a.length;
		for(int i=0;i<len;i++)
		{
			System.out.println(a[i]);
		}
		
		for(char charArray:b)
		{
			System.out.println(charArray);
		}
		
		for(int aArray:a)
		{
			System.out.println(aArray);
		}
		
	}

}
