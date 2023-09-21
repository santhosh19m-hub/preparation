package day3;

public class Task {
	public static void main(String[] args) {
		String a="OneSoft Technologies";
		String b=a.toUpperCase();
		System.out.println("The upper case of String a is "+b+".");
		String c=b.toLowerCase();
		System.out.println("The Lower case of String b is "+c+".");
		String d="Company";
		String e=a.concat(d);
		System.out.println("The Concatination of a and d is "+e+".");
		int f=a.length();
		System.out.println("The Length of a is "+f+".");
		boolean g=a.equals(d);
		System.out.println("Is a and d are equal? "+g);
		boolean h=a.equalsIgnoreCase(b);
		System.out.println("irrespective of case, Is a and b are equal ? "+h);
		boolean i=a.startsWith("O");
		System.out.println("is a Starts with O? "+i);
		boolean j=e.endsWith("y");
		System.out.println("is e Ends with y? "+j);
		boolean k=a.contains("t");
		System.out.println("Is a contains T? "+k);
		
		
	}

}
