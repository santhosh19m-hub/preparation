package task2;

import java.util.Arrays;

public class AnagramInbuilt {

	public static void main(String[] args) {
		String a="race";
		String b="care";
		char[] c=a.toCharArray();
		char[] d=b.toCharArray();
		Arrays.sort(c);
		Arrays.sort(d);
		if(Arrays.equals(c, d)) {
			System.out.println("Anagram");
		}
		else {
			System.out.println("Not Anagram");
		}

	}

}
