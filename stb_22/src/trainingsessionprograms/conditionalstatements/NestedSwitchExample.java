package conditionalstatements;

public class NestedSwitchExample {

	public static void main(String[] args) {
		int num=10;
		switch(num)
		{
			case 10:
				System.out.println("Ten");
				char ch='A';
				switch(ch)
				{
					case 'T':
						System.out.println("Ten in Ten");
						break;
					case 'A':
						System.out.println("A Ten in another Ten");
						break;
				}
				break;
				
			case 20:
				System.out.println("Twenty");
				break;
			default:
				System.out.println("This is default");
		}

	}

}
