package java8;

public class UseNetPrice {

	public static void main(String[] args) {
	NetPrice percent=(a,b,c)->a+(a*b/100)-(a*c/100);
	System.out.println(percent.findNetPrice(1000, 5, 10));
	NetPrice amount=(d,e,f)->d+e-f;
	System.out.println(amount.findNetPrice(1000, 50, 100));

	}

}
