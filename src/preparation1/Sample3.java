package preparation1;

public class Sample3 implements Runnable {
public void run() {
	System.out.println("Thread is Running");
}
	public static void main(String[] args) {
		Sample3 s=new Sample3();
		Thread t=new Thread(s);
		t.start();
		System.out.println("Hello");

	}

}
