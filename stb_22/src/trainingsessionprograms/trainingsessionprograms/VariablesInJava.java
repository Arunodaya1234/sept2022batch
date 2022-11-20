package trainingsessionprograms;

public class VariablesInJava 
{
	//instance variables
	int empId=101;
	String empName="Robert";
	//static variables
	static String city="Mumbai";
	public void displayEmpInfo()
	{
		//local variable
		String landmark="Near Temple";
		System.out.println("Emp id is: "+empId);
		System.out.println("Emp Name is: "+empName);
		System.out.println(city);
		staticMethod();
	}
	
	public static void staticMethod()
	{
		//System.out.println(empId);Error-cannont make static reference
		System.out.println(city);
		//displayEmpInfo();Error-cannont make static reference
	}
	
	public static void main(String[] args) 
	{
		VariablesInJava emp=new VariablesInJava();
		emp.displayEmpInfo();
		emp.staticMethod();
		VariablesInJava.staticMethod();
		VariablesInJava emp1=new VariablesInJava();
	}
}
