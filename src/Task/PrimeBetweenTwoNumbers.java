package Task;

public class PrimeBetweenTwoNumbers {

	public static void main(String[] args) {
		int a=10;
		int b=100;
		boolean c=true;
		for(int i=a;i<=b;i++) {
		for(int j=2;j<a;j++) {
			if(a%j==0) {
				c=false;
			}
		}
		if(c==true) {
			System.out.println(a);
		}
		c=true;
		a=a+1;
		}

	}

}
