package conditionalstatements;

public class IfElseLadderStatement {
	public static void main(String[] args) {
		float per=60;
		if(per<40){
			System.out.println("Fail");
		}
		else if(per>=40&&per<=50){
			System.out.println("Pass");
		}
		else if(per>50&&per<60){
			System.out.println("Second Class");
		}
		else if(per>=60&&per<=70){
			System.out.println("First Class");
		}
		else if(per>70&&per<100){
			System.out.println("Distinction");
		}
		else{
			System.out.println("Please enter valid percentage");
		}

	}

}
