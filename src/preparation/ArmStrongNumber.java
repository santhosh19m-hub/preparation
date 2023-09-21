package preparation;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int a=153;
		int b=a;
		int sum=0,r=0;
		while(b>0) {
			r=b%10;
			sum=sum+(r*r*r);
			b=b/10;
		}
		if(sum==a) {
			System.out.println(a+" is ArmStrongNumber" );
		}
		else {
			System.out.println(a+" is not not ArmstrongNumber");
		}

	}

}
