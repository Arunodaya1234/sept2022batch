package conditionalstatements;

public class NestedIfStatement {

	public static void main(String[] args) {
		if(true)
		{
			if(false)
			{
				System.out.println("First Nested If");
			}
			else
			{
				System.out.println("First nested if false");
				if(false)
				{
					System.out.println("Will not excuted");
					if(true)
					{
						System.out.println(("Third nested if"));
					}
					else
					{
						System.out.println("Third nested if else");
					}
				}
				else
				{
					System.out.println("Will get excuted");
				}
			}
		}
		else
		{
			System.out.println("Out of outer if");
		}
	}

}
