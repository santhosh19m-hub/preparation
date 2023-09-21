package Task;

public class FibonacciSeries {

	public static void main(String[] args) {
		int a=9,sum=0;
		int b=0;
		int c=1;
		System.out.println(b+"\n"+c);
		for(int i=0;i<a-2;i++) {
			sum=b+c;
			b=c;
			c=sum;
			System.out.println(sum);
		}

	}

}
