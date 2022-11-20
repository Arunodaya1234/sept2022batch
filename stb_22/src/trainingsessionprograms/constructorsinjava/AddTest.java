package constructorsinjava;

public class AddTest 
{
	int num;
	AddTest(int num)
	{
		this.num=num;
	}
	public AddTest() {
		// TODO Auto-generated constructor stub
	}
	
	public void show()
	{
		ABC abc=new ABC(this);
		System.out.println(this.num);
	}
	AddTest increment()
	{
		num++;
		return this;
	}
	public static void main(String[] args) 
	{
		AddTest obj1=new AddTest(20);
		obj1.increment().increment();
		obj1.show();
	}

}
