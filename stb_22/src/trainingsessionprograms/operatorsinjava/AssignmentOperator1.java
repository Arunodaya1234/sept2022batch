package operatorsinjava;

public class AssignmentOperator1 {
	public static void main(String[] args) {
	 int a=19,b=31,c=50;
	 a+=1;//a=a+1=19+1=20
	 b-=1;//b=b-1=31-1=30
	 c*=2;//c=c*2=50*2=100
	 int x=(10+a);//10+20=30
	 int y=(x+100);//30+100=130
	 int z=(x+y+c);//30+130+100=260
	 System.out.println("a:"+a);
	 System.out.println("b:"+b);
	 System.out.println("c:"+c);
	 System.out.println("x:"+x);
	 System.out.println("y:"+y);
	 System.out.println("z:"+z);
	}

}
