package preparation1;

public class Sample {
static int a=0;
public Sample () {
	a++;
	System.out.println(a);
}
public static String get() {
return "Hello";	
}
	public static void main(String[] args) {
		Sample s1=new Sample();
		Sample s2=new Sample();
		System.out.println(Sample.get());
	try {
		a=10/0;
	}
	finally {
		System.out.println("Solve");
	}
	System.out.println("EnD");
	}
		static {
			System.out.println("World");
		}

	}


