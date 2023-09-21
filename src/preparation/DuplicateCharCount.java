package preparation;

public class DuplicateCharCount {

	public static void main(String[] args) {
		String a="sella";
		char[] b=a.toCharArray();
		for(int i=0;i<b.length;i++) {
			int count=0;
			for(int j=i+1;j<b.length;j++) {
				if(b[i]==b[j]) {
					count++;
					b[j]='@';
				}
			}
			if(count>0&&b[i]!='@')
			System.out.println(b[i]+"-"+(count+1));
		}

	}

}
