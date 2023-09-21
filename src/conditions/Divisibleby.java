package conditions;

public class Divisibleby {

	public static void main(String[] args) {
		int a=60;
		if((a%2==0)&&(a%3==0)) {
			System.out.println("The number is Divisible by both 2 and 3");
		}
		else if(a%2==0) {
			System.out.println("The number is Divisible by 2");
		}
		else if(a%3==0) {
			System.out.println("The number is divisible by 3");
		}
		else {
			System.out.println("The number is divisible by anyother number");
		}
	} 

}
