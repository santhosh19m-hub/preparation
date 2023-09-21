package task2;

public class Sumis4InaArray {

	public static void main(String[] args) {
		int[] a= {2,3,4,8,1,2,3,1};
		int temp=0;
		for(int i=0;i<a.length;i++) {
			int count=0;
			for(int j=i+1;j<a.length;j++) {
				if(a[i]+a[j]==4) {
					count++;
					temp=a[j];
				}
			}
			if(count==1) {
				System.out.println("["+a[i]+","+temp+"]");
			}
		}

	}

}
