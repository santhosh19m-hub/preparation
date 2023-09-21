package oops2;

public class UseAxisBank {

	public static void main(String[] args) {
		AxisBank a=new AxisBank();
		System.out.println(a.interestRate(50000));
		System.out.println(a.loanCalculation(5000));
		System.out.println(a.rules());
		RbiRules b=new RbiRules();
		System.out.println(b.interestRate(50000));

	}

}
