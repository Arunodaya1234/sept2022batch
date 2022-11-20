package operatorsinjava;

public class OperatorPrecedenceInArithmatic 
{
	int x=9;
	int y=12;
	int z=3;
	
	public void showResult1()
	{
		int res=x-y/3+z*2-1;
		System.out.println("Result is :"+res);
	}
	
	public void showResult2()
	{
		int res=(x-y)/3+((z*2)-1);
		System.out.println("Result is :"+res);
	}
	public static void main(String[] args) {

		OperatorPrecedenceInArithmatic obj=new OperatorPrecedenceInArithmatic();
		obj.showResult1();
		obj.showResult2();

	}

}
