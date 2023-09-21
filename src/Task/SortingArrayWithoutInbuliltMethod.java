package Task;

public class SortingArrayWithoutInbuliltMethod {

	public static void main(String[] args) {
		int[] num= {10,40,30,20,60,50};
		int len=num.length;
		int max=0;
		for(int i=0;i<len;i++) {
			for(int j=i+1;j<len;j++) {
				if(num[i]>num[j]) {
					max=num[i];
					num[i]=num[j];
					num[j]=max;
				}
			}
		}
		for(int i=0;i<len;i++) {
			System.out.print(num[i]+" ");
		}

	}

}
