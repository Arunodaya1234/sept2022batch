package abstractioninjava;

interface Home
{
	void homeLoan();
}
interface Car extends Home
{
	void carLoan();
}
interface Gold extends Car
{
	public abstract void goldLoan();
}

public class Loan implements Gold
{
	public void homeLoan()
	{
		System.out.println("Home Loan");
	}
	public void carLoan()
	{
		System.out.println("Car Loan");
	}
	public void goldLoan()
	{
		System.out.println("Gold Loan");
	}

	public static void main(String[] args) {
		//Car c=new Car();
		Gold g;
		Loan loan=new Loan();
		loan.carLoan();
		loan.goldLoan();
		loan.homeLoan();
	}

}
