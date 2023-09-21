package for1;

public class Average {
	public static void main(String[] args) {
		int count=0;
		int total=0;
		for(int i=1;i<=5;i++) {
			count=count+1;
			total=total+i;
		}
		System.out.println(total/count);
	}
}
