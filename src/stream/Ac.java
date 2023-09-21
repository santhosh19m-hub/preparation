package stream;

public class Ac {
private String brand;
private int price;
private float tons;
private boolean isInverter;
public String getBrand() {
	return brand;
}
public void setBrand(String brand) {
	this.brand = brand;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public float getTons() {
	return tons;
}
public void setTons(float tons) {
	this.tons = tons;
}
public boolean isInverter() {
	return isInverter;
}
public void setInverter(boolean isInverter) {
	this.isInverter = isInverter;
}
public Ac(String brand, int price, float tons, boolean isInverter) {
	super();
	this.brand = brand;
	this.price = price;
	this.tons = tons;
	this.isInverter = isInverter;
}
@Override
public String toString() {
	return "Ac [brand=" + brand + ", price=" + price + ", tons=" + tons + ", isInverter=" + isInverter + "]";
}

}
