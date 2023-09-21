package Task;

public class DuplicatesInAString {

	public static void main(String[] args) {
		String a="pradeep";
		for(int i=0;i<a.length();i++) {
			int count=0;
			for(int j=0;j<a.length();j++) {
				if(i==j) {
					continue;
				}
				else {
				if(a.charAt(i)==a.charAt(j)) {
					count++;
				}
			}
			}
			if(count>1) {
				System.out.println(a.charAt(i));
			}
		}

	}

}
