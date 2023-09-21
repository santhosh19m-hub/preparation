package preparation;

public class StringtoStringNumber {

	public static void main(String[] args) {
		String a="abbccc";
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			int count=0;
			for(int j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {
					count++;
					b[j]='@';
				}
			}
			if(b[i]!='@')
			System.out.print(b[i]+""+(count+1));
		}

	}

}
