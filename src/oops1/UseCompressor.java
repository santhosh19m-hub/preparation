package oops1;

public class UseCompressor {

	public static void main(String[] args) {
		Compressor c1=new Compressor();
		c1.setFanSpeed(100);
		Ac ac=new Ac();
		ac.setBrand("Croma");
		ac.setPrice(40000);
		ac.setCompressor(c1);
		System.out.println(ac.getBrand()+" "+ac.getPrice()+" "+ac.getCompressor().getFanSpeed());

	}

}
