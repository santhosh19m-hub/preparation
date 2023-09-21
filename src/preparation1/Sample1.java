package preparation1;

public class Sample1 {
public void finalize() {
	System.out.println("collected");
}
	public static void main(String[] args) {
		Sample1 s1=new Sample1();
		System.out.println(s1.hashCode());
		s1=new Sample1();
		System.out.println(s1.hashCode());
		System.gc();

	}

}
