package java8;

public class UseCalculator {

	public static void main(String[] args) {
		Calculator add=(num1,num2)->num1+num2;
		System.out.println(add.find(100, 200));
		Calculator sub=(a,b)->a-b;
		System.out.println(sub.find(100, 50));
		System.out.println(Calculator.manipulation());
		add.referanceType();
		Calculator mul=(c,d)->c*d;
		System.out.println(mul.find(5, 6));
		Calculator div=(e,f)->e/f;
		System.out.println(div.find(30,5));

	}

}
