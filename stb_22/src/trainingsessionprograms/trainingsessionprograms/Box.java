package trainingsessionprograms;

public class Box 
{
	int width=22;
	int height=43;
	int length=33;
	
	public void area()
	{
		int area=width*height*length;
		System.out.println("Area of box is :"+area);
	}
	public static void main(String[] args) 
	{
		Box mybox=new Box();
		mybox.width=10;
		mybox.area();

	}

}

//create a basic calculator