package exceptionhandlinginjava;

class OwnException extends Exception
{
	public OwnException(String str) {
		super(str);
	}
}
public class MyException {

	public static void main(String[] args) {
		OwnException oe=new OwnException("My Own Exception");
		try
		{
			throw oe;
		}
		catch(OwnException o)
		{
			System.out.println("Caught:User Defined Exception"+o.getMessage());
		}

	}

}
