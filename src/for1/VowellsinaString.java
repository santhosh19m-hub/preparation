package for1;

public class VowellsinaString {
	public static void main(String[] args) {
		String word="santhosh";
		int count=0;
		for(int i=0;i<=word.length()-1;i++) {
			if(word.charAt(i)=='a'||word.charAt(i)=='e'||word.charAt(i)=='i'||word.charAt(i)=='o'||word.charAt(i)=='u') {
			System.out.println(word.charAt(i));
			count=count+1;
		}
		}
		System.out.println(count);
	}
}
