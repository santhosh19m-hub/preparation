package for1;

public class Palindrome {
	public static void main(String[] args) {
		String a="mom";
		String b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		System.out.println(b);
		if(a.equals(b))
			System.out.println(a+" is palindrome");
		else
			System.out.println(a+" is not a palindrome");
	}
}
