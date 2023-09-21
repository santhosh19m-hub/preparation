package preparation1;

public class Sample2 extends Thread {
public void run() {
	System.out.println("Thread is running");
}
	public static void main(String[] args) {
		Sample2 s=new Sample2();
		s.start();
		System.out.println("Hello");

	}

}
