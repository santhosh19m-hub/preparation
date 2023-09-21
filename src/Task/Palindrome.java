package Task;

public class Palindrome {

	public static void main(String[] args) {
		String a="SAS",b="";
		for(int i=a.length()-1;i>=0;i--) {
			b=b+a.charAt(i);
		}
		if(a.equals(b))
			System.out.println(a+" is Palindrome");
		else
			System.out.println(a+" is not Palindrome");

	}

}
