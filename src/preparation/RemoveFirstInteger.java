package preparation;

public class RemoveFirstInteger {

	public static void main(String[] args) {
		String a="abc523def";
		char[] b=a.toCharArray();
		int c=0;
		for(int i=0;i<b.length;i++) {
			if(b[i]>='0'&&b[i]<='9') {
				c=i;
				break;
			}
		}
		for(int i=b.length-1;i>=0;i--) {
			if(i!=c) {
				System.out.print(b[i]);
			}
		}

	}

}
