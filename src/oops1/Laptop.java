package oops1;

public class Laptop {
private String brand;
private int price;
private int ram;
private Battery battery;
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
public void setRam(int ram) {
	this.ram=ram;
}
public int getRam() {
	return ram;
}
public void setBattery(Battery battery) {
	this.battery=battery;
}
public Battery getBattery() {
	return battery;
}
public String toString() {
	return brand+" "+price+" "+ram+" "+battery;
}
public Laptop(String brand,int price,int ram,Battery battery) {
	this.brand=brand;
	this.price=price;
	this.ram=ram;
	this.battery=battery;
}
}
