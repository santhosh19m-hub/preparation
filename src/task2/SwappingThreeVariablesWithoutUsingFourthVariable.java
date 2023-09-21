package task2;

public class SwappingThreeVariablesWithoutUsingFourthVariable {

	public static void main(String[] args) {
		int a=30;
		int b=50;
		int c=80;
		a=a+b+c;
		b=a-b-c;
		c=a-b-c;
		a=a-b-c;
		System.out.println(a+" "+b+" "+c);

	}

}
