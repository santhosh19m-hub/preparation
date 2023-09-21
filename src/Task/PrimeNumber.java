package Task;

public class PrimeNumber {

	public static void main(String[] args) {
		int a=6;
		boolean b=false;
		for(int i=2;i<a;i++) {
			if(a%i==0) {
				b=true;
			    break;
		}
		}
		if(b==false)
			System.out.println(a+" is Prime Number" );
		else
			System.out.println(a+" is Not Prime Number");
	}

}
