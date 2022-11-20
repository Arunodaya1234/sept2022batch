package constructorsinjava;

public class ABC {
	AddTest ad;
	ABC()
	{
		
	}
	ABC(AddTest ad)
	{
		this.ad=ad;
		System.out.println("ABC def constructor"+this.ad.num);
	}
	
	ABC(int x)
	{
		this();
		System.out.println("ABC one para constructor");
	}
	
	void show()
	{
		System.out.println(ad.num);
	}
	

	public static void main(String[] args) {
		ABC abc=new ABC(10);
		
	}

}
