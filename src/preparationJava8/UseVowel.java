package preparationJava8;

public class UseVowel {

	public static void main(String[] args) {
		String[] a= {"sun","abc","xyz","bfd"};
		Vowell v= x -> {
			for(int i=0;i<a.length;i++) {
		if((a[i].contains("a")||a[i].contains("e")||a[i].contains("i")||a[i].contains("o")||a[i].contains("u"))!=true) {
			System.out.println(a[i]);
		}
		} 
		};
		v.findNonVowel(a);
		

	}

}
