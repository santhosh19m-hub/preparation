package oops1;

public class Ac {
private String brand;
private int price;
private Compressor compressor;
public void setBrand(String brand) {
	this.brand=brand;
}
public String getBrand() {
	return brand;
}
public void setPrice(int price) {
	this.price=price;
}
public int getPrice() {
	return price;
}
public void setCompressor(Compressor compressor) {
	this.compressor=compressor;
}
public Compressor getCompressor() {
	return compressor;
}
}
