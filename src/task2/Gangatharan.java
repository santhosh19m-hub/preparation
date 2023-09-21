package task2;

public class Gangatharan {

	public static void main(String[] args) {
		String a="mmarimugesh";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		char[] c=b.toCharArray();
		for(int j=0;j<c.length;j++) {
			int count=0;
			for(int k=j+1;k<c.length;k++) {
				if(c[j]==c[k]) {
					count++;
					c[k]='0';
				}
			}
			if(count==0&&c[j]!='0') {
				System.out.println(c[j]);
			}
		}

	}

}
