package preparation;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=7;
		boolean isprime=true;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				isprime=false;
				break;
			}
		}
		if(isprime==true) {
			System.out.println(a+" is prime");
		}
		else {
			System.out.println(a+" is not prime");
		}

	}

}
