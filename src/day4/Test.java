package day4;

public class Test {

	public static void main(String[] args) {
		String[] a=args[0].split("#");
		String[] b=args[1].split("-");
		String[] c=args[2].split(",");
		int a1=Integer.parseInt(a[0]);
		int a2=Integer.parseInt(a[1]);
		int b1=Integer.parseInt(b[0]);
		int b2=Integer.parseInt(b[1]);
		int c1=Integer.parseInt(c[0]);
		int c2=Integer.parseInt(c[1]);
		int d=a1+b1;
		int e=a2+b2;
		int f=d*c1;
		int g=e*c2;
		int h=f+g;
		System.out.println(h);
	}

}
