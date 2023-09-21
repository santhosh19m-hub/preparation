package conditions;

public class UppercaseOrLowercaseOrCombinations {

	public static void main(String[] args) {
		String a="Ganesh";
		if(a.equals(a.toUpperCase())) {
			System.out.println("All Characters are in UpperCase");
		}
		else if(a.equals(a.toLowerCase())) {
			System.out.println("All characters are in LoweCase");
		}
		else {
			System.out.println("The word is in Combination of Both Cases");
		}
	}

}
