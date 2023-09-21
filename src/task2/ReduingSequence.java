package task2;

public class ReduingSequence {

	public static void main(String[] args) {
		String a="ABCDEDCBA";
		for(int i=a.length();i>=0;i--) {
			System.out.println(a.substring(0,i));
		}

	}

}
