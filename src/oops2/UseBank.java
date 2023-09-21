package oops2;

public class UseBank {

	public static void main(String[] args) {
		Bank b=new Bank();
		System.out.println(b.loan());
		System.out.println(b.loan(25000));
		System.out.println(b.loan(25000,500000));

	}

}
