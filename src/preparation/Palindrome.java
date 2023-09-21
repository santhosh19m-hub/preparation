package preparation;

public class Palindrome {

	public static void main(String[] args) {
		int a=353;
		int b=a;
		int r=0,sum=0;
		while(b>0) {
			r=b%10;
			sum=sum*10+r;
			b=b/10;
		}
		if(sum==a) {
			System.out.println(a+" is palindrome");
		}
		else {
			System.out.println(a+" is not palindrome");
		}

	}

}
