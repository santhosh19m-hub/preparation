package functions;

public class UseDemo {

	public static void main(String[] args) {
		Demo d=new Demo();
		d.text="hi";
		System.out.println(d.text);
		System.out.println(d.name());
		System.out.println(d.greet("Santhosh"));
		d.exit();
		d.visit("sandy");
	}

}
