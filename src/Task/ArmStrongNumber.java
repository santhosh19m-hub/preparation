package Task;

public class ArmStrongNumber {

	public static void main(String[] args) {
		int n=371,sum=0,r=0;
		int y=n;
		while(y>0) {
			r=y%10;
			sum=sum+(r*r*r);
			y=y/10;
		}
		System.out.println(sum);
		if(sum==n)
			System.out.println(n+" is ArmStrong Number");
		else
			System.out.println(n+" is not ArmStrong Number");
	}

}
