package conditions;

public class AgeClassification {

	public static void main(String[] args) {
		int a=25;
		if((0<=a)&&(a<=12)) {
			System.out.println("Kid");
		}
		else if((13<=a)&&(a<=19)) {
			System.out.println("Teenager");
		}
		else if((20<=a)&&(a<=45)) {
			System.out.println("Adult");
		}
		else
			System.out.println("SeniorCitizen");

	}

}
