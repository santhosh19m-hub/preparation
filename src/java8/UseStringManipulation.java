package java8;

public class UseStringManipulation {

	public static void main(String[] args) {
		String val="San";
		StringManipulation equal=val::equals;
		System.out.println(equal.manipulate("San"));
		StringManipulation start=val::startsWith;
		System.out.println(start.manipulate("S"));

	}

}
