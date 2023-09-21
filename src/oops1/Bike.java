package oops1;

public class Bike {
String brand;
int price;
String colour;
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
public void setColour(String colour) {
	this.colour=colour;
}
public String getColour() {
	return colour;
}
public Bike(String brand,int price,String colour) {
	this.brand=brand;
	this.price=price;
	this.colour=colour;
}
}
