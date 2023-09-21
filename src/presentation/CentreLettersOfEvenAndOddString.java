package presentation;

public class CentreLettersOfEvenAndOddString {

	public static void main(String[] args) {
	String[] a= {"san","Kite","wales","king","thick"};
	for(int i=0;i<a.length;i++) {
		int b=a[i].length();
		int c=b/2;
		if(b%2==0)
			System.out.println(a[i].charAt(c-1)+""+a[i].charAt(c));
		else
			System.out.println(a[i].charAt(c));
	}
	}

}
