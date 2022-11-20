package encapsulationinjava;

public class Student 
{
	public static void main(String[] args) {
		MyStudentAttributes ms=new MyStudentAttributes();
		ms.setRollno(1);
		ms.setName("Robert");
		ms.setWeight(56.34f);
		ms.setCity("Pune");
		
		int rollno=ms.getRollno();
		String name=ms.getName();
		float weight=ms.getWeight();
		String city=ms.getCity();
		
		System.out.println(rollno+" "+name+" "+weight+" "+city);
	}
}

class MyStudentAttributes
{
	private int rollno;
	private String name;
	private float weight;
	private String city;
	public String state;
	
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public float getWeight() {
		return weight;
	}
	public void setWeight(float weight) {
		this.weight = weight;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
}

class One
{
	private int a;
	private int b;
}

class second
{
	private double d;
	public float f;
}
