package preparation1;

public class Example implements Runnable {
public void run() {
	synchronized(Example.class) {
		System.out.println("HELLO");
		try {
			Example.class.wait(2000);
			System.out.println("THREAD IS AWAKED");
		}
		catch(InterruptedException ie) {
			ie.printStackTrace();
		}
	}
}
	public static void main(String[] args) throws InterruptedException {
		Example e=new Example();
		Thread t = new Thread(e);
		t.start();
		Thread.sleep(5000);
		System.out.println("HI WORLD");

	}

}
