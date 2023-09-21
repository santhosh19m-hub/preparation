package conditions;

public class GradeClassification {
	public static void main(String[] args) {
		int a=95;
		if((91<=a)&&(a<=100)) {
			System.out.println("S Grade");
		}
		else if((81<=a)&&(a<=90)) {
			System.out.println("A Grade");
		}
		else if((71<=a)&&(a<=80)) {
			System.out.println("B Grade");
		}
		else if((51<=a)&&(a<=70)) {
			System.out.println("C Grade");
		}
		else if((35<=a)&&(a<=50)) {
			System.out.println("D Grade");
		}
		else if((0<=a)&&(a<=34)) {
			System.out.println("Fail");
		}
		else
			System.out.println("Not a Mark");

	}


}
