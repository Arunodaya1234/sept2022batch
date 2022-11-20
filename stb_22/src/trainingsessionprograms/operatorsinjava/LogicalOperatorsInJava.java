package operatorsinjava;

public class LogicalOperatorsInJava {

	public static void main(String[] args) {

		boolean x=true;
		boolean y=false;
		boolean z=true;
		
		int a=2;
		int b=1;
		int c=3;
		int d=4;
		boolean exp1=(a>b&&c<d);
		System.out.println("exp1 result:"+exp1);//true
		boolean exp2=(a==b&&c!=d);
		System.out.println("exp2 result:"+exp2);//false
		boolean exp3=(a==2||c!=d);
		System.out.println("exp3 result:"+exp3);//true
		
		System.out.println(x&&y);//false
		System.out.println(x||y);//true
		System.out.println(x&&z);//true
		System.out.println(x||z);//true
		System.out.println(!x);//false
		System.out.println(!y);//true
		System.out.println(!x&&y);//false
		System.out.println(x&&!y);//true
	}

}
