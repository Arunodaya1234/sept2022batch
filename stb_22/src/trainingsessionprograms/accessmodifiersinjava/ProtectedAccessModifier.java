package accessmodifiersinjava;

public class ProtectedAccessModifier {

	int rollno=12;
	
	protected void displayRollNo()
	{
		System.out.println("My rollno is:"+rollno);
	}
	public static void main(String[] args) {
		

	}

}

class MyClass extends ProtectedAccessModifier
{
	
}
