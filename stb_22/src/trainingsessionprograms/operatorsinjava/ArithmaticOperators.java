package operatorsinjava;

public class ArithmaticOperators 
{
	public static void main(String[] args) 
	{
		
		float operand1=10f;
		float operand2=7f;
		float result=0;
		result=operand1+operand2;
		System.out.println("--------------ARITHMATIC OPERATORS-----------------");
		System.out.println("Addition: "+result);
		result=operand1-operand2;
		System.out.println("Substraction: "+result);
		result=operand1*operand2;
		System.out.println("Multiplication: "+result);
		result=operand1/operand2;
		System.out.println("Division: "+result);
		result=operand1%operand2;
		System.out.println("Modulus: "+result);
	}

}
