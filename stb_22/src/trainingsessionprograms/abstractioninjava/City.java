package abstractioninjava;

interface Continent
{
	void showContinent();
}
interface Country extends Continent
{
	void showCountry();
}
interface State
{
	void showState();
}
public class City implements State,Country
{

	public static void main(String[] args) {
		City city=new City();
		city.showContinent();
		city.showCountry();
		city.showState();
	}

	public void showCountry() {
		System.out.println("India");
	}

	public void showState() {
		System.out.println("Maharashtra");
	}

	public void showContinent() {
		System.out.println("Asia");
	}

}
