package in.co.rays;

public class GradeGenerator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int g = Integer.parseInt(args[0]);
		
		if (g>=90) {
			System.out.println(" Your Grade is A+");
		} else if (g>=80) {
			System.out.println(" Your Grade is A");

		}else if (g>=70) {
			System.out.println(" Your Grade is B");

		}else if (g>=60) {
			System.out.println(" Your Grade is C");

		}else if (g>=50) {
			System.out.println(" Your Grade is D");

		}else if (g>=40) {
			System.out.println(" Your Grade is E");

		} else { System.out.println(" Better luck next time");
		}



	}

}
