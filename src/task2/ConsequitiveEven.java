package task2;

public class ConsequitiveEven {

	public static void main(String[] args) {
		int[] a= {2,3,5,6,7,2,2,6};
		for(int i=2;i<a.length;i++) {
			if(a[i-2]%2==0&&a[i-1]%2==0&&a[i]%2==0) {
				System.out.println(true);
			}
		}

	}

}
