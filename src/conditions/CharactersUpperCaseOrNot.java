package conditions;

public class CharactersUpperCaseOrNot {

	public static void main(String[] args) {
		String a="Santhosh";
		String b=a.toUpperCase();
		if(a.equals(b)) {
			System.out.println("All the letters are upper case");
		}
		else {
			System.out.println("The wordcontain atleast one small letter");
		}

	}

}
