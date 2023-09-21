package task2;

public class RepeatingValueinArray {

	public static void main(String[] args) {
		int[] a= {1,1,5,5,5,6,7,8,8,8};
		for(int i=0;i<a.length;i++) {
			int temp=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]==a[j]) {
					temp++;
				}
			}
			if(temp==1) {
				System.out.println(a[i]);
			}
		}

	}

}
