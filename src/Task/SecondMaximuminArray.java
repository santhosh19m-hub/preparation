package Task;

public class SecondMaximuminArray {

	public static void main(String[] args) {
		int[] num= {10,90,20,70,60,80};
		int max1=0;
		int	max2=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]>max1) {
				max1=num[i];
			}
		for(int j=0;j<num.length;j++) {
			if(num[j]>max2&&num[j]<max1) {
				max2=num[j];
			}
		}
		}
		System.out.println(max2);

	}

}
