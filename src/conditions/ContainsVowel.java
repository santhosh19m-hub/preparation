package conditions;

public class ContainsVowel {

	public static void main(String[] args) {
		String a="raja";
		boolean b=a.contains("a");
		boolean c=a.contains("e");
		boolean d=a.contains("i");
		boolean e=a.contains("o");
		boolean f=a.contains("u");
		if(b||c||d||e||f)//if(word.contains("a")||word.contains("e")||word.contains("i")||word.contains("o")||word.contains("u"))
			{ 
			System.out.println(a+" Contains vowell");
		}
		else {
			System.out.println(a+" does not contains vowell");
		}
				

	}

}
