package operatorsinjava;

public class TernaryOperator {

	public static void main(String[] args) {
		int x=20;
		int y=10;
		int z=(x>y)?x:y;
		System.out.println("z:"+z);
		
		if(x>y)
		{
			z=x;
		}
		else
		{
			z=y;
		}
		System.out.println("z:"+z);
	}

}
