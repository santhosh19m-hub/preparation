package for1;

public class Primenumber {

	public static void main(String[] args) {
		int number=9;
		boolean b=true;
		for(int i=2;i<number;i++) {
			if(number%i==0) {
				b=false;
			}
		}
		System.out.println(b);

	}

}
