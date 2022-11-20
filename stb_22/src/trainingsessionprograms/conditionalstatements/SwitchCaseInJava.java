package conditionalstatements;

public class SwitchCaseInJava {

	public static void main(String[] args) {
		char city='M';
		switch(city)
		{
			case 'M':
				System.out.println("Mumbai");
				break;
			case 'P':
				System.out.println("Pune");
				break;
			case 'H':
				System.out.println("Hydrabad");
				break;
			case 'D':
				System.out.println("Delli");
				break;
			default:
				System.out.println("Not a city");
		
		}

	}

}
