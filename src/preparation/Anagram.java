package preparation;

public class Anagram {

	public static void main(String[] args) {
		String a="care";
		String b="race";
		String[] c=a.split("");
		int count=0;
		if(a.length()==b.length()) {
			for(int i=0;i<a.length();i++) {
				if(b.contains(c[i])) {
					count++;
				}
			}
			if(b.length()==count) {
				System.out.println(a+" & "+b+" are Anagram");
			}
			else {
				System.out.println(a+" & "+b+" are not Anagram");
			}
		}
		else {
			System.out.println(a+" & "+b+" are not Anagram");
		}

	}

}
