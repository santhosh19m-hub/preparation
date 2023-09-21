package oops1;

public class Car {
private String brand;
private int price;
private String colour;
private Engine engine;
private Tyre tyre;
private Radio radio;
public Car(String brand,int price,String colour,Engine engine,Tyre tyre,Radio radio) {
	this.brand=brand;
	this.price=price;
	this.colour=colour;
	this.engine=engine;
	this.tyre=tyre;
	this.radio=radio;
}
public String toString() {
	return brand+" "+price+" "+colour+" "+engine+" "+tyre+" "+radio;
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
public void setEngine(Engine engine) {
	this.engine=engine;
}
public Engine getEngine() {
	return engine;
}
public void setTyre(Tyre tyre) {
	this.tyre=tyre;
}
public Tyre getTyre() {
	return tyre;
}
public void setRadio(Radio radio) {
	this.radio=radio;
}
public Radio getRadio() {
	return radio;
}

}
