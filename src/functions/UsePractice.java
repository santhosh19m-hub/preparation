package functions;

public class UsePractice {

	public static void main(String[] args) {
		Practice a=new Practice();
		System.out.println(a.check(80));
		System.out.println("Maximum is "+a.max(2000,190));
		System.out.println("big word is "+a.bigword("San","king"));
		int[] num= {12,13,14,15,16,17,18};
		a.printeven(num);
		System.out.println("The maximmum in array is "+a.printmax(num));
	}

}
