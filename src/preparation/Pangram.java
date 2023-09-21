package preparation;

public class Pangram {

	public static void main(String[] args) {
		String a="abcdefghijklmnopqrstuvwxyz";
		boolean b=true;
		for(char ch='a';ch<='z';ch++) {
			if(!a.contains(String.valueOf(ch))) {
				b=false;
				break;
			}
		}
		if(b==true) {
			System.out.println(a+" is Pangram");
		}
		else {
			System.out.println(a+" is not Pangram");
		}

	}

}
