package day4;

public class SplittingTechnique {

	public static void main(String[] args) {
		String[] a=args[0].split("-");
		String name1=a[0];
		String name2=a[1];
		int age=Integer.parseInt(a[2]);
		System.out.println(name1+"\n"+name2+"\n"+age);

	}

}
