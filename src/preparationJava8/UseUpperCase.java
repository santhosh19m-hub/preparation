package preparationJava8;

public class UseUpperCase {

	public static void main(String[] args) {
		String a="santhosh";
		//UpperCase u=String::toUpperCase;
		//System.out.println(u.conUpper(a));
		UpperCase u=a::charAt;
		System.out.println(u.conUpper(5));
	}

}
