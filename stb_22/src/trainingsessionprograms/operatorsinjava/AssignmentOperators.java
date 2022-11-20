package operatorsinjava;

public class AssignmentOperators {

	public static void main(String[] args) {
		int x=20;
		int y=30;
		int z=60;
		
		x+=y;//x=x+y=20+30=50
		y-=x+z;//y=y-(x+z)=30-(110)=-80
		z*=x*y;//z=z*(x*y)60*600=-2400000
		
		System.out.println("x:"+x);
		System.out.println("y:"+y);
		System.out.println("z:"+z);

	}

}
