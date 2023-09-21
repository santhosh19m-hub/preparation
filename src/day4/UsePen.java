package day4;

public class UsePen {

	public static void main(String[] args) {
		Pen p1=new Pen();
		String[] a=args[0].split("-");
		p1.brand=a[0];
		p1.price=Integer.parseInt(a[1]);
		p1.colour=a[2];
		Pen p2=new Pen();
		String[] b=args[1].split("-");
		p2.brand=b[0];
		p2.price=Integer.parseInt(b[1]);
		p2.colour=b[2];
		System.out.println(p1.brand+","+p1.price+","+p1.colour);
		System.out.println(p2.brand+","+p2.price+","+p2.colour);
	}

}
