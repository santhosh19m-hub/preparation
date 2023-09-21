package conditions;

public class Switchexample {

	public static void main(String[] args) {
		char c='/';
		int a=20;
		int b=2;
		int d;
		switch(c) {
		case '+':d=a+b;
		System.out.println("The sum is "+d);
		break;
		case '-':d=a-b;
		System.out.println("The difference  is "+d);
		break;
		case '*':d=a*b;
		System.out.println("The Multiplication is "+d);
		break;
		case '/':d=a/b;
		System.out.println("The division is "+d);
		break;
		default:System.out.println("Invalid operation");
		}
	}

}
