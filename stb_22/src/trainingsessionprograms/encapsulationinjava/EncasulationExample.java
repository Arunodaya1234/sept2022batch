package encapsulationinjava;

public class EncasulationExample {
	
	public static void main(String[] args) {
		
		Demo d=new Demo();
		d.loanamount=4557575d;
		d.setbalance(98798898.687678d);
		double result=d.getbalance();
		System.out.println(result);
	}

}

class Demo
{
	private double balance=4567.89d;
	double loanamount=435435.435d;
	double getbalance()
	{
		return balance;
	}
	
	public void setbalance(double value)
	{
		balance=value;
	}

}
