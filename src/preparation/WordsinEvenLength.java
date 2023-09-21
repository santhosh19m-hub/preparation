package preparation;

public class WordsinEvenLength {

	public static void main(String[] args) {
		String a="This is java program rent";
		String[] b=a.split(" ");
		int c=0;
		for(int i=0;i<b.length;i++) {
			for(int j=i+1;j<b.length;j++) {
				if(b[i].length()==b[j].length()) {
					 c=b[i].length();
					 break;
				}
			}
		}
		for(int i=0;i<b.length;i++) {
			if(b[i].length()==c) {
				System.out.println(b[i]);
			}
		}

	}

}
