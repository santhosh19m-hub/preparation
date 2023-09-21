package preparation;

public class MissingNumber {

	public static void main(String[] args) {
			int[] a= {1,2,3,5,6,8,9};
			for(int i=1;i<=9;i++) {
				int count=0;
				for(int j=0;j<a.length;j++) {
					if(i==a[j]) {
						count++;
					}
				}
				if(count==0) {
					System.out.println(i);
				}
			}

	}

}
