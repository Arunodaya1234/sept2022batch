package conditionalstatements;

public class NestedIfExample {

	public static void main(String[] args) {
		int age=20;
		int weight=80;
		
		if(age>=18)
		{
			if(weight>50)
			{
				System.out.println("Eligible for blood donation");
				if(weight>75)
				{
					System.out.println("Out of Age");
				}
				else
				{
					System.out.println("Enough Age");
				}
			}
			else
			{
				System.out.println("Not eligible for blood donation");
			}
		}
		else
		{
			System.out.println("Age should be greater than 18");
		}

	}

}
