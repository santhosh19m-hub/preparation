package oops1;

public class Pencil {
private String brand;
private int price;
private String colour;
public Pencil(String brand,int price,String colour) {
	this.brand=brand;
	this.price=price;
	this.colour=colour;
}
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
public String toString() {
	return "Colour= "+colour;
}
}
